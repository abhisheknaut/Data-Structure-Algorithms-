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
        List<Integer> ls = new ArrayList<>();
        preorder(root,ls);
        return ls;
    }
    public static void preorder(TreeNode root,List<Integer> ls){
        if(root==null){
            return;
        }
        preorder(root.left,ls);
        preorder(root.right,ls);
        ls.add(root.val);
    }
}