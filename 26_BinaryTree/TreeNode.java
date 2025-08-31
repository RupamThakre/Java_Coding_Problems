

public class TreeNode {

  private int data;
  private TreeNode leftChild;
  private TreeNode rightChild;

  public void insert(int value) {

    /*
     * If the value equals to data,then it's duplicate value,
     * we dont do anything to insert duplicate value
     * just return
     * */

    if (value == data) {
      return;
    }

    if(value < data){

    /*  IF at left no data present, that means I got the inseration point
        ELSE at left already data present then call insert method - kind of recursive call
     */

      if (leftChild == null) {
        leftChild = new TreeNode(value);
      } else {
        leftChild.insert(value);
      }
    } else {
      if (rightChild == null) {
        rightChild = new TreeNode(data);
      } else {
        rightChild.insert(value);
      }
    }

  }

  public TreeNode(int data){
    this.data = data;
  }

  public void traverseInOrder() {
    /*
     * In-Order : LEFT, ROOT, RIGHT
     */
    if (leftChild != null) {
      leftChild.traverseInOrder();
    }
      System.out.println(data + ", ");

    if (rightChild != null) {
      rightChild.traverseInOrder();
    }

  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public TreeNode getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }

  public TreeNode getRightChild() {
    return rightChild;
  }

  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }
}