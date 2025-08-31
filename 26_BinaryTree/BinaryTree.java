
class BinaryTree {

    /*
    * If tree is empty, then node becomes the root
    *
    * if tree is not empty, compare the number with the root node,
    *  - if value is less than root node, go to left
    *  - if value is greater than root node, go to right
    *
    * */

    public static void main(String... args) {

        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();
    }
}