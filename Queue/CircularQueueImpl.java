public class CircularQueueImpl {
    int a[];
    int size;
    int front;
    int rear;
    CircularQueueImpl(int size){
        this.size=size;
       a = new int[size];
       this.front = this.rear = -1; 
    }

    void enqueue(int data){
        if((rear+1)%size == front ){
            System.out.println("Queue overflow");
            return;
        }
        if(front == -1){
            front = front+1;
        }
        rear = (rear+1)%size;
        a[rear] = data;
    }

    int deueue(){
        if(front ==-1){
            System.out.println("Queue underflow");
            return -1;
        }
        if(front == rear ){
            int ele = a[front];
            front = rear =-1;
            return ele;
        }
        int ele = a[front];
        front = (front+1)%size;
        return ele;
    }

    void traverse(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        if(rear < front){
            for(int i=front;i<size;i++){
                System.out.print(a[i] + " ");
            }
            for(int i=0;i<=rear;i++){
                System.out.print(a[i] + " ");
            }
        }else{
            for(int i=front;i<=rear;i++){
                System.out.print(a[i] + " ");
            }
        }
    }
}
