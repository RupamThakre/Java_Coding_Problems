// Node class for the tree


// Binary Search Tree (BST) class
public class BinarySearchTree {
    TreeNode root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Public method to insert a value
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive helper method
    private TreeNode insertRec(TreeNode root, int value) {
        // Base case: found a spot to insert
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        // Recur down the tree
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        // Duplicate values are not inserted

        return root;
    }

    // Inorder traversal (to test the insertions)
    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(TreeNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    // Main method to test the tree
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int value : values) {
            bst.insert(value);
        }

        System.out.println("Inorder traversal of the BST:");
        bst.inorder();  // Output should be sorted values
    }
}


class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int item) {
        value = item;
        left = right = null;
    }
}