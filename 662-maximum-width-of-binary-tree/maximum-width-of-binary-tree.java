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
    int maxwid=0 ;
    List<Long>firstIndex=new ArrayList<>() ;
    public int widthOfBinaryTree(TreeNode root) {
        dfs(root,0,0) ;
        return maxwid ;
    }
    void dfs(TreeNode node,int level,long index){
        if(node==null){
            return ;
        }
        if(level==firstIndex.size()){
            firstIndex.add(index) ;
        }
        long width=index-firstIndex.get(level) + 1 ;
        maxwid=Math.max(maxwid,(int)(width)) ;
        dfs(node.left,level+1,2*index+1) ;
        dfs(node.right,level+1,2*index+2) ;
    }
}