/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
   public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>(); // in bfs we take queue to traverse one level completely
        List<List<Integer>> ll = new LinkedList<>();
        if (root == null) {
            return ll;
        }
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size(); // here n is the level size or number of elements in level
            List<Integer> current = new LinkedList<Integer>();
            for (int i = 0; i < n; i++) {
                Node node = q.poll();
                current.add(node.val); // add element value to linkedlist
                q.addAll(node.children); // add children to queue to for next level traversal
            }
            ll.add(current); // add current level list to ll or result linkedlist
        }
        return ll;
    }
}
