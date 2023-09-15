class Node4
{
    int data;
    Node4 next;
    Node4(int x)
    {
        data=x;
        next=null;
    }
}
public class InsertEndLinkedList {

    public static Node4 insertEnd(Node4 head,int x)
    {
        Node4 temp=new Node4(x);
        if(head==null)
            return temp;
        Node4 curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }

    public static void printList( Node4 head)
    {
        Node4 curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }

    public static Node4 delHead(Node4 head)
    {
        if(head==null)
            return null;
        else
            return head.next;
    }

    public static Node4 delLast(Node4 head)
    {
        if(head==null)return null;
        if(head.next==null)return null;
        Node4 curr=head;
        while(curr.next.next!=null)
            curr=curr.next;
        curr.next=null;
        return head;
    }

    public static Node4 insertPos(Node4 head,int pos,int data)
    {
        Node4 temp= new Node4(data);
        if(pos==1)
        {
            temp.next=head;
            return temp;
        }
        Node4 curr=head;
        for(int i=1;i<=pos-2&&curr!=null;i++)
            curr=curr.next;
        if(curr==null)
            return head;
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static Node4 sortedInsert(Node4 head,int x)
    {
        Node4 temp = new Node4(x);
        if(head==null)return temp;
        if(x<head.data)
        {
            temp.next=head;
            return temp;
        }
        Node4 curr=head;
        while(curr.next!=null&&curr.next.data<x)
        {
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
        return head;
    }

    public static void printMiddle(Node4 head)
    {
        if(head==null)return;
        Node4 slow=head,fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void printNthFromEnd(Node4 head,int n)
    {
        int len=0;
        for(Node4 curr=head;curr!=null;curr=curr.next)
            len++;
        if(len<n)
            return;
        Node4 curr=head;
        for(int i=0;i<len-n;i++)
            curr=curr.next;
        System.out.println(curr.data);

    }

    public static void printNthFromEnd2(Node4 head,int n)
    {
        if(head==null)return;
        Node4 first=head;
        for(int i=0;i<n;i++)
        {
            if(first==null)return;
            first=first.next;
        }
        Node4 second=head;
        while(first!=null)
        {
            second=second.next;
            first=first.next;
        }
        System.out.println(second.data);
    }

    public static void main(String[] args) {
        Node4 head = null;
        head=insertEnd(head,10);
        head=insertEnd(head,20);
        head=insertEnd(head,30);
       printList(head);
        System.out.println();
        Node4 head1=delHead(head);
        printList(head1);
        System.out.println();
        Node4 head2=delLast(head);
        printList(head2);
        System.out.println();
        Node4 head3=insertPos(head,2,45);
        printList(head3);
        System.out.println();
        Node4 head4=sortedInsert(head,18 );
        printList(head4);
        System.out.println();
       printMiddle(head);
        printNthFromEnd(head,1);
        printNthFromEnd2(head,3);

    }
}
