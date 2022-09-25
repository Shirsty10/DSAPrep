import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class GenericTree {

    private static class Node {
        int data;
        ArrayList<Node> childern = new ArrayList<>();

       Node(int data){
        this.data = data;
       }
    }
    
    /*  Steps - 1. Create a node
                2. Set the data
                3. check if data == -1 then pop 
                4. else check if stack is empty them make that node as root 
                5. else add that node as children of peek element */
            
    protected Node createTree(int[] arr) {
        Stack<Node> st = new Stack<>();
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                st.pop();
            } else {
                Node newNode = new Node(arr[i]);

                if (st.size() > 0) {
                    Node top = st.peek();
                    top.childern.add(newNode);
                    
                } else {
                    root = newNode;
                    
                }
                st.push(newNode); 
            }
        }
        //display(root);
        //LevelOrderTraversal1(root);
        return root;
    }


    public void display(Node root){
        if(root == null){
            return;
        }
         String str = root.data+ " -> ";
        for(Node child : root.childern){
            str+= child.data + " , ";
        }
        System.out.println(str + ".");
         for(Node child : root.childern){
            display(child);
         }
    }

    //remove - print - add children
    public void LevelOrderTraversal1(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (q.size() > 0) {
          Node n = q.remove();
          System.out.print(n.data + " -> ");
          for(Node child : n.childern){
            System.out.print(child.data + ",");
            q.add(child);
          }
          System.out.println();
        }
    }

    //delimeter approach
    public void LevelOrderTraversal2(Node root) {
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        q.add(new Node(-2));

        while (q.size() > 0) {
            Node top = q.remove();

            if (top.data != -2) {
                System.out.print(top.data + " ");
                for (Node child : top.childern) {
                    q.add(child);
                }
            } else {
                if(q.size() > 0){
                    
                    q.add(new Node(-2));
                    System.out.println();
                }
              
            }

           

        }

    }
         
    


}
