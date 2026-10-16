class Solution {
    public int subarraySum(int[] nums, int k) {
        int subArrays = 0;
        int prefix = 0;
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            prefix += num;
            if(map.containsKey(prefix - k)){
                System.out.println("hello");
                subArrays += map.get(prefix - k);
            }
            if(prefix - k == 0){
                subArrays += 1;
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);


        }
        return subArrays;
        
    }
}