class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++)
                if(nums[i] + nums[j] == target){
                    indices.add(i);
                    indices.add(j);
            }
        }
        return indices.stream().mapToInt(Integer::intValue).toArray();
    }

}