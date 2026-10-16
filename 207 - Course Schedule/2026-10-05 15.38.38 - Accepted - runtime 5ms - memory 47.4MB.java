class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // build an adjacency list using the edges given 
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < numCourses; i++){
            map.put(i, new ArrayList<>());
        }
        for(int[]p : prerequisites){
            int a = p[0];
            int b = p[1];
            map.get(a).add(b);

        }

        int[]visited = new int[numCourses];

        for(int i = 0; i < numCourses; i++){
            if(!dfs(i, map, visited)){
                return false;
            }
        }
        return true;
    
    }

    private boolean dfs(int course, HashMap<Integer, List<Integer>> map, int[] visited){
        if(visited[course] == 2){
            return true;
        }
        if(visited[course] == 1){
            return false;
        } 
        visited[course] = 1;
        for(int neighbor : map.get(course)){
            if(!dfs(neighbor, map, visited)){
                return false;

            }  
        }
        visited[course] = 2;
        return true;
    }
}