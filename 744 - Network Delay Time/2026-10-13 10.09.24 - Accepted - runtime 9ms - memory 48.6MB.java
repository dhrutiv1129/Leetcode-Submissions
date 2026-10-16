class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        // Step 1: Build adjacency list
        List<int[]>[] graph = new ArrayList[n + 1];

        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : times) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }

        // Step 2: Initialize distances
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );

        pq.offer(new int[]{k, 0});

        // Step 3: Dijkstra
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int node = curr[0];
            int distance = curr[1];

            if (distance > dist[node]) {
                continue;
            }

            for (int[] neighbor : graph[node]) {
                int next = neighbor[0];
                int d = neighbor[1];

                int nd = distance + d;

                if (nd < dist[next]) {
                    dist[next] = nd;
                    pq.offer(new int[]{next, nd});
                }
            }
        }

        // Step 4: Find maximum shortest distance
        int r = 0;

        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            r = Math.max(r, dist[i]);
        }

        return r;
    }
}