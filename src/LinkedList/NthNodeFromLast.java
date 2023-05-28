package LinkedList;

public class NthNodeFromLast {

  static int getNthFromLast(Node head, int n) {

    Node temp = head;

    int count = countNode(head);

    if (count < n)
      return -1;

    for (int i = 0; i < count - n; i++) {
      temp = temp.next;
    }
    return temp.data;
  }


  public static int countNode(Node node) {
    int c = 0;
    Node temp = node;
    while (temp != null) {
      temp = temp.next;
      c++;
    }
    return c;
  }

  public static void main(String[] agr) {
    Node root = new Node(10);
    root.next = new Node(4);
    root.next.next = new Node(5);
    root.next.next.next = new Node(3);
    root.next.next.next.next = new Node(6);
    root.next.next.next.next.next = new Node(8);
    int res = getNthFromLast(root, 7);
    System.out.println(res);
  }

}
