class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        int[] pair = new int[2];
        for(int i = 0; i < nums.length; i++){
            pair[0] = i;
            int n = target - nums[i];
            if(map.containsKey(n) && map.get(n) != i){
                pair[1] = map.get(n);
                return pair;

            }
            


        }
        
        return pair;
    }
}