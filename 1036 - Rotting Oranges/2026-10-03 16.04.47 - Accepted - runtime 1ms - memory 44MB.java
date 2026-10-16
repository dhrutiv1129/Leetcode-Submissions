class Solution {
    public int orangesRotting(int[][] grid) {
       
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j});
                } 
            }
        }
        int count = 0;
        while(!queue.isEmpty()){
            boolean rotted = false;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int[]current = queue.poll();
                if(current[0] > 0 && grid[current[0] - 1][current[1]] == 1){
                    rotted = true;
                    grid[current[0] - 1][current[1]] = 2;
                    queue.offer(new int[]{current[0] - 1, current[1]});
                }
                if(current[0] < grid.length - 1 && grid[current[0] + 1][current[1]] == 1){
                    rotted = true;
                    grid[current[0] + 1][current[1]] = 2;
                    queue.offer(new int[]{current[0] + 1, current[1]});
                }
                if(current[1] > 0 && grid[current[0]][current[1] - 1] == 1){
                    rotted = true;
                    grid[current[0]][current[1] - 1] = 2;
                    queue.offer(new int[]{current[0], current[1] - 1});
                }
                if(current[1] < grid[current[0]].length - 1 && grid[current[0]][current[1] + 1] == 1){
                    rotted = true;
                    grid[current[0]][current[1] + 1] = 2;
                    queue.offer(new int[]{current[0], current[1] + 1});

                }
            }
            if(rotted){
                count += 1;

            }
            
            
             
          
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
        }
    }
        return count;
        
    }
}


   