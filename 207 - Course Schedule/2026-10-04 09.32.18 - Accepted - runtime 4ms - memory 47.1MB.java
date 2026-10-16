class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      

        // create an adjacency list
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] prereq : prerequisites){
            int a = prereq[0];
            int b = prereq[1];
            graph.get(a).add(b);
        }
        int[] visited = new int[numCourses];
        for(int i = 0; i < numCourses; i++){
            if(dfs(graph, i, visited)){
                return false;
            }
            
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> graph, int course, int[]visited){

        if(visited[course] == 2){
            return false;
        }
        visited[course] = 1;
        for(int neighbor : graph.get(course)){
            if(visited[neighbor] == 1){
                return true;
            }
            if(dfs(graph, neighbor, visited)){
                return true;
            }

        }
        visited[course] = 2;

        return false;
    }
}