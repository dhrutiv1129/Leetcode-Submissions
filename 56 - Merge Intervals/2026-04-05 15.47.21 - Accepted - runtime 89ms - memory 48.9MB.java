class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);
        System.out.println(merged);
        for(int i = 0; i < intervals.length - 1; i++){
            int[] last = merged.get(merged.size() - 1);
            System.out.println(Arrays.toString(last));
            int[] curr = intervals[i + 1];
            System.out.println(Arrays.toString(curr));
            if (curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
            } else {
                merged.add(curr);
            }
           
            

        }
        return merged.toArray(new int[merged.size()][]);
    }
}

