class LinkedListImpl {

    class Node {
        int data ;
        Node next;

        Node (int data){
            this.data =data;
            this.next = null;

        }
    }


    Node head;
    int index =0;
    
    public void insertAtEnd(int n){
     Node node = new Node(n);
     Node temp = head;
     if(head==null) head = node;
     else {
         while(temp.next!=null){
             temp = temp.next;
         }
         temp.next=node;
     }
     index++; 
    }
    public void insertAtStart(int n){
        Node node = new Node(n);

        if(head==null) head = node;
        else{
            node.next = head;
            head = node;
        }
        index++; 
    }
       //traverse till pos-2 so that positioned element can be inserted
    public void insertAtPosition(int n, int pos){
        if(pos > index)
        {
            System.out.println("Position should be less than length");
            return;
        }
      
     if(pos == 1){
        insertAtStart(n);
        return;
     }        
        if(pos == index){
            insertAtEnd(n);
            return;
        }
        Node temp = head;
        while(pos-2!=0){
            temp = temp.next;
            pos--;
        }
        Node node = new Node(n);
        node.next = temp.next;
        temp.next = node;
        index++; 

    }
    public void deleteAtEnd(){
     Node temp = head;
     while(temp.next.next!=null){
         temp = temp.next;
     }
     temp.next= null;
     index--;
    }
    public void deleteAtStart(){
      if(head == null) return;
      else if(head.next==null){
          head =null;
          return;
      }
      head = head.next;
      index--;
    }

    //traverse till pos-2 so that positioned element can be deleted
    public void deleteAtPosition(int pos){
        if(pos > index)
        {
            System.out.println("Position should be less than length");
            return;
        }
      if(pos ==1){
          deleteAtStart();
          return;
      }else if (pos ==index){
          deleteAtEnd();
          return;
      }
      else{
          Node temp = head;
          while(pos-2!=0){
              temp = temp.next;
              pos--;
          }
          temp.next = temp.next.next;
      }
      index--;
        
    }

    public void traverse(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    //And condition is required as both the condition must true
    public int midOfList(){
        Node fast =head;
        Node slow  = head;
        if(head!=null){
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
    }
        return slow.data;
    }

    public void reverseByIteration(){
        Node current = head;
        Node nextone = head;
        Node prev = null;

        while(current !=null){
            nextone = current.next;
            current.next = prev;
            prev = current;
            current = nextone;
        }
        head = prev;
    }

    public void traverseUsingRecursion(Node n){
        if(n==null){
            return;
        }
        System.out.print(n.data + " -> ");
        traverseUsingRecursion(n.next);
    }
    public void reverseUisngRecursion(Node n){
      if(n==null)
       return;

       reverseUisngRecursion(n.next);
       System.out.print(n.data + " -> ");
    }

    public int getKthElementFromEnd(int k){
        if(index-k<0){
            System.out.println("Invalid K");
            return 0;
        }
        Node fast =head;
        Node slow = head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
         
        }
        return slow.data;
    }


}
