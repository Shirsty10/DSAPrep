import java.util.*;

public class mainFile {

    public static void main(String[] args) {
        try (Scanner inp = new Scanner(System.in)) {
        }

        // LinkedList------------------------------------------------
        /*
         * LinkedListImpl l1= new LinkedListImpl();
         * LinkedListImpl l2= new LinkedListImpl();
         * for(int i=0;i<=n;i++)
         * l1.insertAtStart(i);
         * for(int i=6;i<=10;i++)
         * l2.insertAtStart(i);
         * l1.traverse();
         * for(int i=0;i<=n;i++)
         * l1.insertAtEnd(i);
         * l1.insertAtPosition(9,10);
         * l1.traverse();
         * l1.deleteAtEnd();
         * l1.traverse();
         * l1.deleteAtStart();
         * l1.traverse();
         * 
         * l1.deleteAtPosition(9);
         * l1.traverse();
         * 
         * System.out.println(l1.midOfList());
         * l1.traverse();
         * l1.reverseByIteration();
         * l1.traverseUsingRecursion(l1.head);
         * System.out.println("Reverse using recursion");
         * l1.reverseUisngRecursion(l1.head);
         * System.out.println();
         * l1.traverseUsingRecursion(l1.head);
         * System.out.println();
         * System.out.println(l1.getKthElementFromEnd(8));
         * 
         * System.out.print("First List---- ");
         * l1.traverseUsingRecursion(l1.head);
         * System.out.println();
         * System.out.print("Second List---- ");
         * l1.traverseUsingRecursion(l2.head);
         * System.out.println();
         * 
         * 
         * utilityFunctions fun = new utilityFunctions();
         * LinkedListImpl.Node newStart = fun.merge2LL(l1.head,l2.head);
         * 
         * l1.traverseUsingRecursion(newStart);
         * LinkedListImpl.Node node=l1.reverseUsingPoiner(l1.head);
         * l1.traverseUsingRecursion(node);
         * for(int i=0;i<n;i++){
         * int num = inp.nextInt();
         * l1.insertAtEnd(num);
         * }
         * System.out.println("Enter size for 2nd String : ");
         * int n2 = inp.nextInt();
         * for(int i=0;i<n2;i++){
         * int num = inp.nextInt();
         * l2.insertAtEnd(num);
         * }
         * 
         * 
         * 
         * 
         * int x = inp.nextInt();
         * utilityFunctions fun = new utilityFunctions();
         * LinkedListImpl.Node temp = fun.partition(l1.head, x);
         * l1.traverseUsingRecursion(temp);
         * 
         * System.out.println(l1.isLLPalindrome(l1.head));
         * System.out.println(l1.sizeLL() + " " + l2.sizeLL());
         * System.out.println(fun.insersectionPt(l1, l2));
         * }
         */

        // Stack ----------------------------------------------------
        /*
         * stackUtility ut = new stackUtility();
         * String s= inp.next();
         * 
         * System.out.println(ut.duplicateBrackets("(a+b)+(c+d)"));
         * System.out.println(ut.balancedBrackets("{({[]([)})}"));
         * 
         * st.pop();
         * st.display();
         * System.out.println(st.sizeStack());
         * System.out.println(st.isEmpty());
         * System.out.println(st.top());
         * int a[][] = {{2,3},{3,7},{8,6},{9,10}};
         * ut.mergeIntervals(a);
         * 
         * int a[] = {2,5,9,3,1,12,6,8,7};
         * //int[] ans = ut.nextGreaterEleToRight(a);
         * int[] ans = ut.nextGreEleToRight2(a);
         * for(int i=0;i<ans.length;i++){
         * System.out.print(ans[i] +" ");
         * }
         */

        // Queue---------------------------------------
        /*
         * QueueImpl q = new QueueImpl();
         * q.enqueue(2);
         * q.enqueue(3);
         * q.enqueue(5);
         * q.enqueue(7);
         * System.out.println(q.frontEle());
         * System.out.println(q.rearEle());
         * q.traverse();
         * System.out.println("Rear Element is " + q.rearEle());
         * System.out.println(q.dequeue());
         * q.traverse();
         * 
         * CircularQueueImpl qu = new CircularQueueImpl(5);
         * qu.enqueue(6);
         * qu.enqueue(9);
         * qu.enqueue(3);
         * qu.enqueue(16);
         * qu.enqueue(19);
         * System.out.println("Front " + qu.front + " Rear " + qu.rear);
         * qu.enqueue(13);
         * qu.traverse();
         * System.out.println();
         * System.out.println(qu.deueue());
         * System.out.println(qu.deueue());
         * System.out.println(qu.deueue());
         * qu.enqueue(18);
         * qu.traverse();
         * System.out.println("Front " + qu.front + " Rear " + qu.rear);
         */

        /*Generic tree */
        GenericTree t = new GenericTree();
        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        t.LevelOrderTraversal2(t.createTree(arr)); 

    }

}
