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
    int answer = 0;
    public int longestUnivaluePath(TreeNode root) {
        path(root);
        return answer;
    }
    public int path(TreeNode root){
        if(root==null) return 0;
        int left = path(root.left);
        int right = path(root.right);
        int leftLength = 0, rightLength = 0;
        if(root.left!=null && root.val==root.left.val) leftLength+=left+1;
        if(root.right!=null && root.val==root.right.val) rightLength+=right+1;
        answer = Math.max(answer, leftLength+rightLength);
        return Math.max(leftLength,rightLength); 
    }
}