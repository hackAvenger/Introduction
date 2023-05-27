package Trees;

public class CountNumberOfNode {

  //count number of node in tree
  public static int countNode(Node root) {

    if (root == null) return 0;

    return countNode(root.leftNode) + countNode(root.rightNode) + 1;
  }

  //Count number of leaves in tree
  public static int countNoOfLeaves(Node node){

    if(node==null) return 0;

    if (node.leftNode == null && node.rightNode == null) return 1;

    return countNoOfLeaves(node.rightNode) + countNoOfLeaves(node.leftNode);

  }

  public static void main(String[] arg) {
    Node node = new Node(50);
    node.leftNode = new Node(40);
    node.leftNode.rightNode = new Node(45);
    node.leftNode.leftNode = new Node(30);
    node.rightNode = new Node(60);
    int count = countNoOfLeaves(node);
    System.out.println(count);
  }
}


class Node {
  int data;
  Node leftNode;
  Node rightNode;

  Node(int data) {
    this.data = data;
    this.leftNode = null;
    this.rightNode = null;
  }
}
