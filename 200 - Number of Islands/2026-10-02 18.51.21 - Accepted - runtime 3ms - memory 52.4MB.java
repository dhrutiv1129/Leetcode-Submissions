class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    islands += 1;
                    dfs(i, j, grid);
                }
            }
        }
    return islands;
        
    }

    private void dfs(int m, int n, char[][]grid){
        if(m < 0 || m >= grid.length || n < 0 || n >= grid[m].length || grid[m][n] == '0'){
            return;
        } 

        grid[m][n] = '0';
        dfs(m + 1, n, grid);
        dfs(m - 1, n, grid);
        dfs(m, n + 1, grid);
        dfs(m, n - 1, grid);



    }
}