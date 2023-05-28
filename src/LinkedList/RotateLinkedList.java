package LinkedList;

public class RotateLinkedList extends PrintLinkedList{

  public static void addNodeInLast(Node root,Node node){
    Node temp=root;
    while (temp.next!=null){
      temp=temp.next;
    }
    temp.next=node;
  }

  public static Node  rotate(Node root,int k){
    Node curr=root;
    Node prev=null;
    for(int i=0;i<k;i++){
        prev=curr;
        curr=curr.next;
        prev.next=null;
        addNodeInLast(curr,prev);
    }
    return curr;
  }
  public static void main(String[] agr) {
    Node root = new Node(10);
    root.next = new Node(4);
    root.next.next = new Node(5);
    root.next.next.next = new Node(3);
    root.next.next.next.next = new Node(6);
    root.next.next.next.next.next = new Node(8);

    printNode(root);
    Node res =rotate(root,3);
    printNode(res);
  }
}
