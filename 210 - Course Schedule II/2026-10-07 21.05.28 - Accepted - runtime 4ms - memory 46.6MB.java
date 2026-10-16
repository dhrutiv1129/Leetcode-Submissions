class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        //create adjacency list 
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] p : prerequisites){
            int course = p[0];
            int prereq = p[1];
            graph.get(course).add(prereq);
        }
        // matrix keeping track of the state of visitation
        int[] visited = new int[numCourses];
        // array with the course ordering

        List<Integer> order = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) {
                if (!dfs(i, graph, visited, order)) {
                    return new int[0];
                }   
            }
        }
        int[] result = new int[order.size()];

        for (int i = 0; i < order.size(); i++) {
            result[i] = order.get(i);
        }

        return result;
        
    }

    private boolean dfs(int course, List<List<Integer>> graph, int[] visited, List<Integer> order){
        
        visited[course] = 1;
        for(int neighbor : graph.get(course)){
            if(visited[neighbor] == 0){
                if(!dfs(neighbor, graph, visited, order)){
                    return false;
                }
            } if(visited[neighbor] == 1){
                return false;
            } 
        }

        visited[course] = 2;
        order.add(course);
        return true;


        
    }
}