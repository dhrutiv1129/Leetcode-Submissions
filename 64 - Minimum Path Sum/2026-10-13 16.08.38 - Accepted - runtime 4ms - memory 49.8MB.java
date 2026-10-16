class Solution {
    public int minPathSum(int[][] grid) {
        // get the dimensions
        // intialize first row and col 
        // each cell can only be reached fromone direction


        // iterate through the remaining
        

        // return bottom right after updating in place

        for(int i = 1; i < grid.length; i++){
            grid[i][0] += grid[i - 1][0];
        }

        for(int j = 1; j < grid[0].length; j++){
            grid[0][j] += grid[0][j - 1];
        }

        for(int i = 1; i < grid.length; i ++){
            for(int j = 1; j < grid[i].length; j++){
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }


        return grid[grid.length - 1][grid[0].length - 1];
    }
}