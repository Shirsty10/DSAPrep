
public class utilityFunctions {
    public LinkedListImpl.Node merge2LL(LinkedListImpl.Node head,LinkedListImpl.Node head2){
        if(head==null)
        return head2;
        else if(head2==null)
        return head;
        else{
            LinkedListImpl.Node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = head2;
        }
        return head;
    }

    public LinkedListImpl.Node removeDuplicates(LinkedListImpl.Node head){
        LinkedListImpl.Node newNode =null;
        return newNode;
    }
}
