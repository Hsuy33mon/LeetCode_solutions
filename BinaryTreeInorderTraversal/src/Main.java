// Link to the question - > https://leetcode.com/problems/binary-tree-inorder-traversal/

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        inorderTraversal inorderTraversal = new inorderTraversal();
        // Example 1: [1, null, 2, 3]
        TreeNode root1 = arrayToTree(new Integer[]{1, null, 2, 3});
        System.out.println("Example 1 output: " + inorderTraversal.inorderTraversalSolution(root1)); // Expected: [1, 3, 2]

        // Example 2: [1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9]
        TreeNode root2 = arrayToTree(new Integer[]{1, 2, 3, 4, 5, null, 8, null, null, 6, 7, 9});
        System.out.println("Example 2 output: " + inorderTraversal.inorderTraversalSolution(root2)); // Expected: [4, 2, 6, 5, 7, 1, 3, 9, 8]

        // Example 3: []
        TreeNode root3 = arrayToTree(new Integer[]{});
        System.out.println("Example 3 output: " + inorderTraversal.inorderTraversalSolution(root3)); // Expected: []

        // Example 4: [1]
        TreeNode root4 = arrayToTree(new Integer[]{1});
        System.out.println("Example 4 output: " + inorderTraversal.inorderTraversalSolution(root4)); // Expected: [1]
    }

    public static TreeNode arrayToTree(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode node = queue.poll();

            if (arr[i] != null) {
                node.left = new TreeNode(arr[i]);
                queue.add(node.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                node.right = new TreeNode(arr[i]);
                queue.add(node.right);
            }
            i++;
        }

        return root;
    }
}