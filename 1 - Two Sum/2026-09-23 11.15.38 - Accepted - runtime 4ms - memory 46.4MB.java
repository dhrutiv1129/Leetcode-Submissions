class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        int[] ind = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff) && i != map.get(diff)){
                ind[0] = i;
                ind[1] = map.get(diff);
                return ind;
            }
        }
        return null;
        
    }
}