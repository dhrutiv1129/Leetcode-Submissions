class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> sums = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            while(i > 0 && nums[i - 1] == nums[i] && i < nums.length -1){
                i += 1;
            }
            int rem = 0 - nums[i];
            int left = i + 1;
            System.out.println(left);
            int right = nums.length - 1;
            System.out.println(right);
            while(left < right){
             
                if(nums[left] + nums[right] == rem){
                    List<Integer> entry = new ArrayList<>();
                    entry.add(nums[i]);
                    entry.add(nums[left]);
                    entry.add(nums[right]);
                    sums.add(entry);
                    left++;
                    right--;
             
            while (left < right && nums[left] == nums[left - 1]) {
                left++;
            }

            while (left < right && nums[right] == nums[right + 1]) {
                right--;
            }

                }
                else if(nums[left] + nums[right] > rem){
                    right -= 1;
                } else{
                    left += 1;
                }
          

            }
        }
        
        return sums; 
    
    }
    
}