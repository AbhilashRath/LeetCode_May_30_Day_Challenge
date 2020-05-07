/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        int x_depth=0;
        int y_depth=0;
        int depth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int w = q.size();            
            for(int i=0;i<w;i++){
                TreeNode n = q.poll();
                if(n.val==x){
                    x_depth = depth;
                }else if(n.val==y){
                    y_depth = depth;
                }                
                //System.out.println(n.val);
                if(n.left!=null){
                    q.add(n.left);
                }
                if(n.right!=null){
                    q.add(n.right);
                }
                if((n.left!=null)&&(n.right!=null)){
                    if(((n.left.val==x)&&(n.right.val==y))||((n.left.val==y)&&(n.right.val==x))){
                        return false;
                    }                
                }                
            }
            depth++;
        }
        
        System.out.println(x_depth);
        System.out.println(y_depth);
        
        return x_depth==y_depth;
        
    }
}
