class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] numbers = new int [2];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                numbers[0] = i;
                numbers[1] = map.get(target - nums[i]);
                return numbers;
            }
            map.put(nums[i], i);
        }
        
        return numbers;
    }
}