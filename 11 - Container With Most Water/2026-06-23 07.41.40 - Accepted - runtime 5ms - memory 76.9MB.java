class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(right > left){
            
                max = Math.max(max, (right - left) * Math.min(height[right], height[left]));
            
            if (height[left] < height[right]){
                left += 1;
            } 
            else {
                right -= 1;
            }
        }

        return max;
        
    }
}