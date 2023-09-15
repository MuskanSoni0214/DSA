class Node2
{
    int data;
    Node2 next;
    Node2(int x)
    {
        data=x;
        next=null;
    }
}
public class SearchLinkedList {

    public static int iterative(Node2 head, int x)
    {
        int pos=1;
        Node2 curr=head;
        while(curr!=null)
        {
            if(curr.data==x)
                return pos;
            else
            {
                pos++;
                curr=curr.next;
            }
        }
        return -1;
    }

    public static int recursive(Node2 head, int x)
    {
        if(head==null)
            return -1;
        if(head.data==x)
            return 1;
        else {
            int res=recursive(head.next,x);
            if(res==-1)
                return -1;
            else
                return (res+1);
        }

    }

    public static void main(String[] args) {
        Node2 head=new Node2(10);
        head.next=new Node2(20);
        head.next.next=new Node2(30);
        head.next.next.next=new Node2(40);
        System.out.println(iterative(head,1 ));
        System.out.println(recursive(head,10));
    }
}
