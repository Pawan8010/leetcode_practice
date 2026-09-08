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
    static int findh(TreeNode root){
        if(root==null) return 0;

       return 1+Math.max(findh(root.left),findh(root.right));
      
    }
    public boolean isBalanced(TreeNode root) {
         if(root==null) return true;

        int rh=findh(root.left);
        int lh=findh(root.right);

        if(Math.abs(rh-lh)>1) return false;

        boolean r=isBalanced(root.left);

        boolean l=isBalanced(root.right);

        if(!r||!l) return false;
        // int left=check(root.left);
        // if(left==-1) return -1;

        // int right=check(root.right);
        // if(right==-1) return -1;
        // if(Math.abs(right-left)>1) return -1;

        //  return 1+Math.max(left,right);
        return true;
      
    }
}