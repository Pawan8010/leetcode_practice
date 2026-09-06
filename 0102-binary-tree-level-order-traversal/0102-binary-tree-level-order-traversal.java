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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>list=new LinkedList<>();
        Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return list;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
             List<Integer>ll=new LinkedList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();

                ll.add(node.val);

                if(node.left!=null){
                    q.offer(node.left);
                }

                   if(node.right!=null){
                    q.offer(node.right);
                }
               
              
            }
            list.add(ll);

        }
        return list;
    }
}