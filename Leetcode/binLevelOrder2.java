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
    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        int h = height(root); 
        int i; 
        List<List<Integer>> res = new ArrayList<>();
        for (i = h; i >= 1; i--){ 
            List<Integer> l = new ArrayList<>();
            printGivenLevel(root, i,l); 
            res.add(l);
        }
        return res;
    }
    
    void printGivenLevel(TreeNode node, int level, List<Integer> l)  
    { 
        if (node == null) 
            return; 
        if (level == 1) 
            l.add(node.val);
        else if (level > 1)  
        { 
            printGivenLevel(node.left, level - 1,l); 
            printGivenLevel(node.right, level - 1,l); 
        } 
    } 
   
    int height(TreeNode node)  
    { 
        if (node == null) 
            return 0; 
        else
        { 
            int lheight = height(node.left); 
            int rheight = height(node.right); 
   
            if (lheight > rheight) 
                return (lheight + 1); 
            else
                return (rheight + 1); 
        } 
    }
    
}