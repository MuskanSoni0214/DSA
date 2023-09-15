class Node3
{
    int data;
    Node3 next;
    Node3(int x){
       data=x;
       next=null;
    }
}
public class InsertInBeginInLinkedList {

    public static Node3 insertBegin(Node3 head,int x)
    {
        Node3 temp=new Node3(x);
        temp.next=head;
        return head;
    }

    public static void printList( Node3 head)
    {
        Node3 curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }


    public static void main(String[] args) {
        Node3 head=null;
        head=insertBegin(head,30);
        head=insertBegin(head,20);
        head=insertBegin(head,10);
        printList(head);


    }
}
