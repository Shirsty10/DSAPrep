

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

    // public LinkedListImpl.Node removeDuplicates(LinkedListImpl.Node head){
    //     LinkedListImpl l = new LinkedListImpl();
    //     LinkedListImpl.Node  temp = head;
    //     l.insertAtEnd(head.data);
    //     while(temp!=null){
    //         if(temp.data == l)
    //     }
    //     return newNode;
    // }

    /*Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
      You should preserve the original relative order of the nodes in each of the two partitions.*/
      public LinkedListImpl.Node partition(LinkedListImpl.Node head, int x){
       
        LinkedListImpl.Node smallHead = new LinkedListImpl.Node(-1);
        LinkedListImpl.Node largeHead = new LinkedListImpl.Node(-1);
        LinkedListImpl.Node small = smallHead;
        LinkedListImpl.Node large = largeHead;
        LinkedListImpl.Node temp = head;

        while(temp!= null){
            if(temp.data < x){
               small.next =temp;
               small = small.next;
            }else{
                large.next =temp;
               large = large.next;
            }
            temp=temp.next;
        }
        small.next = null;
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;


      }

      public int insersectionPt(LinkedListImpl head1,LinkedListImpl head2){
          if(head1==null || head2 == null){
              return 0;
          }
        LinkedListImpl.Node t1 = head1.head;
        LinkedListImpl.Node t2 = head2.head;


          int delta = Math.abs(head1.sizeLL()-head2.sizeLL());
          //System.out.println(delta);
          if(head1.sizeLL()>head2.sizeLL()){
              for(int i=0;i<delta ;i++){
                  t1 = t1.next;
              }
          }else if(head1.sizeLL()<head2.sizeLL()){
            for(int i=0;i<delta ;i++){
                t2 = t2.next;
            }
        }
        while(t1.data!=t2.data){
            t1=t1.next;
            t2= t2.next;
        }
        return t1.data;
      }
}
