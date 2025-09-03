class Node {

    int key;
    Node left;
    Node right;

    public Node(int item) {
        key = item;
        left = right = null;
    }

}

public class BinaryTree
{
    Node root;

    public BinaryTree() {
        root = null;
    }

    //public method to insert a new Node
    public void insert(int key) {
        root = insertRec(root, key);
    }

    //Recursive helper function for insertion
    private Node insertRec(Node root, int key) {

        // if the tree is empty, return a new Node
        if(root == null) {
            root = new Node(key);
            return root;
        }

        //Otherwise, recur down the tree

        if(key < root.key) {
            root.left = insertRec(root.left, key);
        } else if(key > root.key) {
            root.right = insertRec(root.right, key);
        }

        // If key is equal to root.key, it's a duplicate and can be ignored or handled differently

        //Return the (potentially unchanged) node pointer
        return root;

    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the BST:");
        tree.inOrder();
    }
}