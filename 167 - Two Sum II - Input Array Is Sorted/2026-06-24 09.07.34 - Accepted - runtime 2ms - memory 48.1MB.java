class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] nums = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while(right > left){
            int x = numbers[right];
            int y = numbers[left];

            if(x + y == target){
                nums[0] = left + 1;
                nums[1] = right + 1;
                return nums;
            } else if(x + y > target){
                right -= 1;
            } else {
                left += 1;
            }
        }
        return nums;
        
    }
}