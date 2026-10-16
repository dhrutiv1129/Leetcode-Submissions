class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] n = new int[nums.length];
        int prefix = 1;
        for(int i = 0; i < nums.length; i++){
            n[i] = prefix;
            prefix *= nums[i];
            

        }
        int suffix = 1;
        for(int i = nums.length - 1; i >= 0; i --){
            n[i] *= suffix;
            suffix *= nums[i];
        }
        return n;
    }
}