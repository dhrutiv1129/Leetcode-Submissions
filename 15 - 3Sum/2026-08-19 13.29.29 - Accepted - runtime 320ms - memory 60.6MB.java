class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            int left = i + 1;
            int right = nums.length - 1;
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    List<Integer> row = new ArrayList<>();
                    row.add(nums[i]);
                    row.add(nums[left]);
                    row.add(nums[right]);
                    result.add(row);
                    left++;
                    right--;
                    
                }
                else if(nums[i] + nums[left] + nums[right] > 0){
                    right -= 1;
                } else{
                    left += 1;
                }
            }
        }
        return new ArrayList<>(result);
       
    }
}