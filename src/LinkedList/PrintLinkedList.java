package LinkedList;

public class PrintLinkedList {

  public static void printNode(Node root) {
    Node head = root;
    while (head != null) {
      System.out.print(head.data + " ");
      head = head.next;
    }
    System.out.println();
  }

}
