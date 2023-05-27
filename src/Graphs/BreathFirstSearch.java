package Graphs;

import java.util.Queue;

public class BreathFirstSearch {


  public static void bfs(Node node) {

    int[] visited = {0, 0, 0, 0, 0, 0, 0, 0};


  }

  public static void main(String[] arg) {

    /*
                         1
                       /   \
                      2     3
                     /  \  /  \
                    4   5 6    7
                    \   | |    /
                     \  | |   /
                      \ | |  /
                       \| | /
                         8
     */
    Node root = new Node(1);
    root.leftNode = new Node(2);
    root.rightNode = new Node(3);
    root.leftNode.leftNode = new Node(4);
    root.leftNode.rightNode = new Node(5);
    root.rightNode.leftNode = new Node(6);
    root.rightNode.rightNode = new Node(7);
    root.leftNode.leftNode.rightNode = new Node(8);
    root.leftNode.rightNode.leftNode = root.leftNode.leftNode.rightNode;
    root.rightNode.leftNode.leftNode = root.leftNode.leftNode.rightNode;
    root.rightNode.rightNode.leftNode = root.leftNode.leftNode.rightNode;
    bfs(root);
    System.out.println(root.leftNode.rightNode.leftNode.data);

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
