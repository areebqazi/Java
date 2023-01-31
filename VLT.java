import java.util.*;

class VLT {
    //This is EXACT SAME as https://leetcode.com/problems/binary-tree-vertical-order-traversal/
    //Just that we need to sort two numbers if they are on same level based on
    // 1. Depth and 2.Smaller number first(if depth same)
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) return levels;

        //Map to Store lists for each level number {levelNumber,List}
        Map<Integer,List<NodeInfo>> map = new TreeMap();
        
        //Queue is used for doing BFS on the binary tree
        Queue<NodeInfo> queue = new LinkedList();

        //Adding details level and depth in NodeInfo object so that it can be used to sort later
        queue.add(new NodeInfo(root,0,0));
        
        //Traverse the entire binary tree and keep adding the NodeInfo objects to corresponding levelNumber in map
        while ( !queue.isEmpty() ) {
            NodeInfo n =  queue.remove();

            List<NodeInfo> list = map.getOrDefault(n.level,new ArrayList());
            list.add(n);
            map.put(n.level,list);
        
            // add child nodes of the current level in the queue for the next level
            if (n.node.left != null) queue.add(new NodeInfo(n.node.left,n.level-1,n.depth+1));
            if (n.node.right != null) queue.add(new NodeInfo(n.node.right,n.level+1,n.depth+1));
          }

        //Iterate over each level number in map
        map.forEach((levelNumber,list)->{
            //Sorting the list based on the criteria specified below
            Collections.sort(list,new NodeInfoComparator());
            
            //Add all the nodes for current level
            List<Integer> currLevel = new ArrayList(list.size());
            for(NodeInfo n: list){
                currLevel.add(n.node.val);
            }
            
            //Adding the current level to the final result
            levels.add(currLevel);
        });

        return levels;
    }
    
    /***
    The map already stores the list in the way of {LevelNumber,List}. Hence, level number is already taken care of.

    Now, within a list, we need to care about two things
        1. Depth should be in ascending order
        2. If depth is same, make sure the lower number is first
    **/                                         
    public class NodeInfoComparator implements Comparator<NodeInfo> {
        public int compare(NodeInfo n1, NodeInfo n2){
            if(n1.depth < n2.depth) return -1;
            if(n1.depth > n2.depth) return 1;
            else return n1.node.val - n2.node.val;
        }
    }
    
    class NodeInfo{
        private TreeNode node;        
        private int level; //Vertical Level (left decreasing. right increating)
        private int depth; //Horizontal distancde from root (top to bottom increasing)
        
        public NodeInfo(TreeNode _node, int _level, int _depth){
            this.node = _node;
            this.level = _level;
            this.depth = _depth;
        }
    }
}