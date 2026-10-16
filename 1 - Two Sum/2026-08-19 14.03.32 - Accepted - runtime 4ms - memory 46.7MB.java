class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        int[]ind = new int[2];
        for(int i = 0; i < nums.length; i++){
            int rem = target - nums[i];

            if(map.containsKey(rem) && map.get(rem) != i){
                // add indices to array
                ind[0] = i;
                ind[1] = map.get(rem);
                // return array
                return ind;
            }
        }
    return ind;
        
    }

}