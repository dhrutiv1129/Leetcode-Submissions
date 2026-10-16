class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '0'){
                    continue;
                } else{
                    islands++;
                    // do dfs
                    dfs(grid, i, j);

                }
            }
        }
        
    return islands;
    }
    private void dfs(char[][] grid, int i, int j){
        
        // check if valid
        if(i >= grid.length || i < 0 || j >= grid[i].length || j < 0 || grid[i][j] == '0'){
            return;

        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}
