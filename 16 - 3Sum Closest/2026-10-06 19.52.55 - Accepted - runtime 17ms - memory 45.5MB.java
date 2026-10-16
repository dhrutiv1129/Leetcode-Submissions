class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int minDiff = nums[nums.length - 1];
        int minAdd = nums[nums.length - 1];
        int closest = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length; i++){
            int left = i + 1;
            int right = nums.length - 1;

            // return the minimum
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - closest)) {
                    closest = sum;
                } 

                if(sum == target){
                    return target;
                }
                if(sum < target){
                    left += 1;

                } else if(sum > target){
                    right -= 1;
                } 

            }
        }
        return closest;
        
    }
}