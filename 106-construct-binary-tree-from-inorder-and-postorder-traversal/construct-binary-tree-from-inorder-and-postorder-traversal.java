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
    int minindex ;
    public TreeNode buildTree(int[] inorder, int[] postorder) { 
        minindex=postorder.length-1 ;
        return construct(inorder,postorder,0,inorder.length-1) ;
    } 
    private TreeNode construct(int[] inorder,int[]postorder,int left,int right){ 
        if(left>right){
            return null ;
        } 
        int rootvalue=postorder[minindex--] ;
        TreeNode root=new TreeNode(rootvalue) ;
        int index=left ;
        while(inorder[index]!=rootvalue){ 
            index++ ;
        } 
        root.right=construct(inorder,postorder,index+1,right) ; 
        root.left=construct(inorder,postorder,left,index-1) ;
        return root ;
    }
}