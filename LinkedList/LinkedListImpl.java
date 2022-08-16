class LinkedListImpl {

   static class Node {
         int data ;
         Node next;
 
         Node (int data){
             this.data =data;
             this.next = null;
             
         }
     }
 
     Node head;
     int size;
  
 
   public int sizeLL(){
       return size;
   }
     
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
     size++; 
     }
     public void insertAtStart(int n){
         Node node = new Node(n);
 
         if(head==null) head = node;
         else{
             node.next = head;
             head = node;
         }
         size++; 
     }
        //traverse till pos-2 so that positioned element can be inserted
     public void insertAtPosition(int n, int pos){
         if(pos > size)
         {
             System.out.println("Position should be less than length");
             return;
         }
       
      if(pos == 1){
         insertAtStart(n);
         return;
      }        
         if(pos == size){
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
         size++; 
 
     }
     public void deleteAtEnd(){
      Node temp = head;
      while(temp.next.next!=null){
          temp = temp.next;
      }
      temp.next= null;
      size--;
     }
     public void deleteAtStart(){
       if(head == null) return;
       else if(head.next==null){
           head =null;
           return;
       }
       head = head.next;
       size--;
     }
 
     //traverse till pos-2 so that positioned element can be deleted
     public void deleteAtPosition(int pos){
         if(pos > size)
         {
             System.out.println("Position should be less than length");
             return;
         }
       if(pos ==1){
           deleteAtStart();
           return;
       }else if (pos ==size){
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
       size--;
         
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
         if(size-k<0){
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
 
     public Node reverseUsingPoiner(Node head){
      Node n=head;
      if(n.next==null){
          return null;
      }
      reverseUsingPoiner(n.next);
      n.next.next=n;
      return head;
     }
 
     Node left;
     public boolean isLLPalindrome(Node n){
         left = head;
         return isPalindroneHelper(n);
     }
     public boolean isPalindroneHelper(Node right){
         if(right== null){
             return true;
         }
       boolean res = isPalindroneHelper(right.next);
       if(res == false) return false;
       if(right.data != left.data){
          return false;
       }
       else {
           left = left.next;
           return true;
       }
     }
 
 
 }
 