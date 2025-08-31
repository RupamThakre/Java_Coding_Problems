public class Tree {

    /*
    * So if we have root node, we could easily get the Right and Left child
    * By traversing the left and right node
    *
    * */

    private TreeNode root;

    public void insert(int value){
        if (root == null){
            root = new TreeNode(value);
        }else {
            root.insert(value);
        }

    }

}