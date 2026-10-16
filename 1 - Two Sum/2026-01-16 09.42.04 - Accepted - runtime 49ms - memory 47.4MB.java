class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexList = new int[2];


        for(int i = 0; i < nums.length; i ++){
            int currNum = nums[i];
            for(int j = i + 1; j < nums.length; j++){
                if(currNum + nums[j] == target){
                   indexList[indexList.length - 2] = i;
                   indexList[indexList.length - 1] = j;

                }
            }
        }
        return indexList; 
    }
   
}