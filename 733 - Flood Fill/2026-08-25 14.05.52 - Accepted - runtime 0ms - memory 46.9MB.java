class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val = image[sr][sc];
        dfs(image, sr, sc, val, color);       
        return image;
    }    
    
    
    private void dfs(int[][]image, int i, int j, int val, int color){
        if(i >= image.length || i < 0 || j >= image[i].length || j < 0 || image[i][j] != val){
            return;
        }
        if (val == color) {
            return;
        }
        image[i][j] = color;
        dfs(image, i + 1, j, val, color);
        dfs(image, i - 1, j, val, color);
        dfs(image, i, j + 1, val, color);
        dfs(image, i, j - 1, val, color);


    }
}
