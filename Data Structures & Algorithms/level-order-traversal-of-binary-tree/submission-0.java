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
        if(root == null) return new ArrayList<>(); 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        List<List<Integer>> result = new ArrayList<>();

        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++)
            {
                TreeNode f = q.poll();
                level.add(f.val);
                if(f.left != null)
                q.add(f.left);
                if(f.right != null)
                q.add(f.right);
            }
            result.add(level);
        }

        return result;
    }
}
