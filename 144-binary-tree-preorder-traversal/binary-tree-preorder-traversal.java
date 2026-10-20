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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>empty=new ArrayList<>();
        preorder(root,empty) ;
        return empty ;
    }
    private void preorder(TreeNode root,List<Integer>empty){ 
        if(root!=null){ 
            empty.add(root.val) ;
            preorder(root.left,empty)  ;
            preorder(root.right,empty) ;
        }
    }
}