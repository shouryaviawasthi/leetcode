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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", paths);
        }
        return paths;
    }

    private void findPaths(TreeNode node, String currentPath, List<String> paths) {
        currentPath += Integer.toString(node.val);
        
        if(node.left == null && node.right == null) {
            paths.add(currentPath);
        } else {
            currentPath += "->";
            if (node.left != null) findPaths(node.left, currentPath, paths);
            if (node.right != null) findPaths(node.right, currentPath, paths);
        }
    }
        }