class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       // create a hash map of the elemnts and their frequencies
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        
       }
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(map.get(b), map.get(a)));
       for(int num : map.keySet()){
            pq.offer(num);
       }

       int[]r = new int[k];

       for(int i = 0; i < k; i++){
        r[i] = pq.poll();

       }
       // create a priority queye that's ordered by the value of the numbers passed in
       // load the priority queue
       // poll the priority queue k times

        return r;
    }
}