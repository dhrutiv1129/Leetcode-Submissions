class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[]nums = new int[2];

        while(right > left){
            int sum = numbers[right] + numbers[left];
            if(sum == target){
                nums[0] = left + 1;
                nums[1] = right + 1;
                return nums;
                
            }
            else if(sum < target){
                left += 1;
            } else{
                right -= 1;
                

            }
        }

    return nums;
            
        }



      
        
    

}