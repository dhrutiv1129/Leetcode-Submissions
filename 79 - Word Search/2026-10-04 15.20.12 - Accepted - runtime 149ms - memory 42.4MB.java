class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if (dfs(board, i, j, 0, word, visited)) {
                    return true;
                }
                    
                }
            }
               return false;
        }
     
        
    

    private boolean dfs(char[][] grid, int i, int j, int next, String word, boolean[][]visited){
        if (next == word.length()) {
    return true;
}
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length){
            return false;
        }
        if(visited[i][j]){
            return false;
        }

        
       
        if(grid[i][j] != word.charAt(next)){
            return false;
        }
        visited[i][j] = true;
        boolean found = dfs(grid, i - 1, j, next + 1, word, visited) || dfs(grid, i + 1, j, next + 1, word, visited) || dfs(grid, i, j + 1, next + 1, word, visited) || dfs(grid, i, j - 1, next + 1, word, visited);
        visited[i][j] = false;
       return found;

    }
}