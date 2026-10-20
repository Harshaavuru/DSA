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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>empty=new ArrayList<>() ;
        postorder(root,empty) ;
        return empty ;
    } 
    private void postorder(TreeNode root,List<Integer>empty){ 
        if(root==null){
            return ;
        }
        if(root!=null){ 
            postorder(root.left,empty) ;
            postorder(root.right,empty) ;
            empty.add(root.val) ;
        }
    }
}