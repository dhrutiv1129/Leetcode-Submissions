class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]arr = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        int sum = 0;
        while(right > left){
            sum = numbers[right] + numbers[left];
            if(sum > target){
                right -= 1;
            } else if(sum < target){
                left += 1;
            } else{
                arr[0] = left + 1;
                arr[1] = right + 1;
                return arr;
                
            }
            
        }
        return arr;
        
    }
}