

//Using LinkedList
 class StackImpl<T> {
    
    class Node {
        T data;
        Node next;
        Node(T data){
            this.data =data;
            this.next = null;
        }
    }
    
    Node top;
    int size;

    StackImpl(){
        this.top = null;
        this.size =0;
    }

   //In Stack, push - Insert

   void push(T data){
    Node n = new Node(data);
    if(top != null){
        n.next = top;
        top = n;
    }else{
        top = n;
    }
    size++;
   }

   //In Stack, pop - delete
    
   T pop(){
    if(top!=null){
        T data = top.data;
        top = top.next;
        size--;
        return data;
    }else{
        return null;
    }
    
   }

   T top(){
    T val = top.data;
    return val;
   }

   boolean isEmpty(){
    if(top ==null)
       return true;
       else return false;
   }

   int sizeStack(){
    return size;
   }

   void display(){
    if(top ==null){
        System.out.println("Stack overflow");
        return;
    }

   Node temp = top;
   while(temp!=null){
    System.out.print(temp.data + " ");
    temp=temp.next;
   }
   System.out.println();

   }
//e.g - ((a+b) + (c+d)) - false , (a+b)+ ((d+c)) - true(brackets over d+c are duplicate)
//Using Stack inbuild



}
