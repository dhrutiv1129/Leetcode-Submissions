class Solution {
    public boolean exist(char[][] board, String word) {
        boolean [][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                    if (dfs(board, word, i, j, 0, visited)) {
                        return true;
                } 
            }
        }
        return false;
        // check every cell
        // if the first letter exists in that cell
        // dfs into that cell, along with providing what the next character is, the word, and the 
        // coordinates of that cell, and visited
        
    }

    private boolean dfs(char[][] board, String word, int i, int j, int place, boolean[][]visited){
        
        if(place == word.length()){
            return true;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(place)|| visited[i][j]){
            return false;
        }

        visited[i][j] = true;
        boolean found = dfs(board, word, i+1, j, place + 1, visited) ||
        dfs(board, word, i - 1, j, place + 1, visited) ||
        dfs(board, word, i, j + 1, place + 1, visited)||
        dfs(board, word, i, j - 1, place + 1, visited);
        visited[i][j] = false;

        return found;

        



    }
}