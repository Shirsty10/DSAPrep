import java.util.*;

public class mainLL {
    
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        LinkedListImpl l1= new LinkedListImpl();
        LinkedListImpl l2= new LinkedListImpl();
        for(int i=0;i<=n;i++)
           l1.insertAtStart(i);
           for(int i=6;i<=10;i++)
           l2.insertAtStart(i);
        //  l1.traverse();
        // for(int i=0;i<=n;i++)
        //   l1.insertAtEnd(i);
        // l1.insertAtPosition(9,10);
        // l1.traverse();
        // l1.deleteAtEnd();
        // l1.traverse();
        // l1.deleteAtStart();
        // l1.traverse();

        // l1.deleteAtPosition(9);
        // l1.traverse();

    //    System.out.println(l1.midOfList());
    //     l1.traverse();
    //  l1.reverseByIteration();
    //  l1.traverseUsingRecursion(l1.head);
    // System.out.println("Reverse using recursion");
    //  l1.reverseUisngRecursion(l1.head);
    //  System.out.println();
    //  l1.traverseUsingRecursion(l1.head);
    //  System.out.println();
    // System.out.println(l1.getKthElementFromEnd(8));

    System.out.print("First List---- ");
    l1.traverseUsingRecursion(l1.head);
    System.out.println();
    System.out.print("Second List---- ");
    l1.traverseUsingRecursion(l2.head);
    System.out.println();

    
utilityFunctions fun = new utilityFunctions();
LinkedListImpl.Node newStart = fun.merge2LL(l1.head,l2.head);

l1.traverseUsingRecursion(newStart);

      
    }
}
