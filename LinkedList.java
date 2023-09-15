
class NodeClass
{
    String data;
    NodeClass next;

    NodeClass(String data)
    {
        this.data=data;
        next=null;
    }
}
public class LinkedList {

     NodeClass head;
     int size;

     LinkedList()
     {
         this.size=0;
     }

    public  void addFirst(String data)
    {
        NodeClass newNode=new NodeClass(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }

    public void addLast(String data)
    {
        NodeClass newNode=new NodeClass(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        NodeClass currNode = head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is Empty!");
            return;
        }
        NodeClass currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");

    }

    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
        size--;
    }

    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        NodeClass secondLast=head;
        NodeClass lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getter()
    {
        return this.size;
    }

    public void reverseIterate()
    {
        if(head==null||head.next==null)
            return;
        NodeClass prevNode=head;
        NodeClass currNode=head.next;
        while(currNode!=null)
        {
            NodeClass nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public NodeClass removeFromNth(NodeClass head,int n)
    {
        if(head.next==null)
        {
            return null;
        }

        //size
        int size=0;
        NodeClass curr=head;
        while(curr!=null)
        {
            curr=curr.next;
            size++;
        }

        if(n==size)
            return head.next;

        int indexToSearch=size-n;
        NodeClass prev=head;
        int i=1;
        while(i<indexToSearch)
        {
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;

    }

    public boolean isPalindrome(NodeClass head)
    {
        if(head==null||head.next==null)
            return true;
        NodeClass middle= findMiddle(head);
        NodeClass secondHalfStart=reverse(middle.next);
        NodeClass firstHalfStart=head;
        while(secondHalfStart!=null)
        {
              if(firstHalfStart.data!=secondHalfStart.data)
                  return false;
              firstHalfStart=firstHalfStart.next;
              secondHalfStart=secondHalfStart.next;
        }
        return true;
    }

    public NodeClass reverse(NodeClass head)
    {
        NodeClass prev=null;
        NodeClass curr=head;
        while(curr!=null)
        {
            NodeClass next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public NodeClass findMiddle(NodeClass head)
    {
        NodeClass hare=head;
        NodeClass turtle=head;
        while(hare.next!=null||hare.next.next!=null)
        {
            hare=hare.next.next;
            turtle=turtle.next;
        }
        return turtle;
    }

    public boolean hasCycle(NodeClass head)
    {
        if(head==null)
            return false;
        NodeClass hare=head;//fast
        NodeClass turtle=head;//slow
        while(hare!=null&&hare.next!=null)
        {
            turtle=turtle.next;
            hare=hare.next.next;
            if(hare==turtle)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("a");
        list.addLast("List");
        list.printList();
//        System.out.println();
//        System.out.println("Size of LinkedList "+list.getter());
//        lst.deleteFirst();
//        list.deleteLast();
//        list.printList();
//        System.out.println();
//        System.out.println("Size of LinkedList "+list.getter());
//        list.reverseIterate();
//        list.printList();


    }
}
