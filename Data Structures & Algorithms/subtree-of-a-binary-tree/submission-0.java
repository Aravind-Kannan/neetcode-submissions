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
    boolean isSameTree(TreeNode l, TreeNode r)
    {
        if(l == null && r == null) return true;
        else if(l == null || r == null || l.val != r.val) return false;
        return isSameTree(l.left, r.left) && isSameTree(l.right, r.right);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        if(isSameTree(root, subRoot)) return true;
        if(root != null) return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        else return false;
    }
}
