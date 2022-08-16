
class QueueImpl {
    class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node front, rear;
    int f, r;

    QueueImpl(){
       front = rear = null;
    }

    void enqueue(int data){
        Node node = new Node(data);
        if(rear == null){
            this.front = this.rear = node;
            f=r=0;
        }else{
            this.rear.next = node;
            this.rear = node;
            r++;
        }

    }

    int dequeue(){
        if(front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }else if( front == rear ){
            int ele = front.data;
            front = rear = null;
            f=r=-1;
            return ele;
        }else{
        int ele = front.data;
        front = front.next;
        f++;
        return ele; 
        }
        
    }

    int frontEle(){
      return front.data;
    }

    int rearEle(){
        return rear.data;
    }
 
    int frontIdx(){ return f;}

    int rearIdx() {return r;}

    void traverse(){
        if(front!=null){
            Node temp = front;
            while(temp!=rear.next){
                System.out.print(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println();
        }else{
            System.out.println("No element present");
        }
        
    }

    
}
