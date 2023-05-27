package LinkedList;

public class ModifyLinkedList {

  public static void printNode(Node root) {
    Node head = root;
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
  }

  public static void modifyLinkedList(Node root) {

    int midNode = (countNode(root)) % 2 == 0 ? (countNode(root) / 2) - 1 : (countNode(root) / 2);

    Node head = root;
    Node midNodePtr = root;

    for (int i = 0; i < midNode; i++) {
      midNodePtr = midNodePtr.next;
    }

    midNodePtr.next = reverseLinkedList(midNodePtr.next);

    Node mid = midNodePtr.next;

    midNode = (countNode(root)) % 2 == 0 ? midNode + 1 : midNode;
    for (int j = 0; j < midNode; j++) {
      int i = head.data;
      head.data = mid.data - head.data;
      mid.data = i;
      mid = mid.next;
      head = head.next;
    }
    midNodePtr.next = reverseLinkedList(midNodePtr.next);
  }

  public static Node reverseLinkedList(Node node) {
    Node prevNode = null;
    Node currNode = node;
    Node nextNode = null;
    while (currNode != null) {
      nextNode = currNode.next;
      currNode.next = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }
    return prevNode;
  }

  public static int countNode(Node root) {
    Node head = root;
    int count = 0;
    while (head != null) {
      count++;
      head = head.next;
    }
    return count;
  }

  public static void main(String[] agr) {
    Node root = new Node(10);
    root.next = new Node(4);
    root.next.next = new Node(5);
    root.next.next.next = new Node(3);
    root.next.next.next.next = new Node(6);
    root.next.next.next.next.next = new Node(8);
    printNode(root);
    System.out.println();
    modifyLinkedList(root);
    printNode(root);

  }
}


class Node {
  int data;
  Node next;

  Node(int data) {
    this.data = data;
    this.next = null;
  }
}
