class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = Math.min(height[right], height[left]) * (right - left);
        while(left < right){
            if(height[left] < height[right]){
                left += 1;
            } else{
                right -= 1;
            }
            maxArea = Math.max(maxArea, Math.min(height[right], height[left]) * (right - left));
        }
        return maxArea;
    }
}