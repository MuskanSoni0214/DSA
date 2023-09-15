class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next=null;
    }
}
public class SimpleLinkedList {
    public static void main(String[] args) {
        Node head=new Node(10);
        Node tem1=new Node(20);
        Node tem2=new Node(30);
        head.next=tem1;
        tem1.next=tem2;




    }
}
