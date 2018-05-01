public class MaxDepthBinaryTree {

    /**
     * Given a binary tree, find its maximum depth.
     * The maximum depth is the number of nodes along the longest path from the root node down to the farthest
     * leaf node.
     */

    static class TreeNode {
        int key;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            this.key = x;
            left = null;
            right = null;
        }
    }

    public int GetMaxDepth(TreeNode root) {
        int maxDepth = 0;
        if (root.left == null && root.right == null)
            return 0;
        else if (root.left == null)
            return maxDepth + GetMaxDepth(root.right) + 1;
        else if (root.right == null)
            return maxDepth + GetMaxDepth(root.left) + 1;
        else
            return Integer.max(GetMaxDepth(root.left), GetMaxDepth(root.right)) + 1 + maxDepth;
    }

}
