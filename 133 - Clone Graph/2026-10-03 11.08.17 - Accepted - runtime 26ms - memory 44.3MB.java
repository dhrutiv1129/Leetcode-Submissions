/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        Node copy = new Node(node.val);
        HashMap<Node, Node> map = new HashMap<>();
        map.put(node, copy);
        dfs(map, node);
        return map.get(node);


        
    }
    private void dfs(HashMap<Node, Node> map, Node node){
        Node currCopy = map.get(node);
        for(Node n : node.neighbors){
            if(!map.containsKey(n)){
                Node nCopy = new Node(n.val);
                map.put(n, nCopy);
                dfs(map, n);

            }
            currCopy.neighbors.add(map.get(n));
           
        }
    }
}