package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LinkedListSolution {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        // Adding elements in a linked list
        linkedList1.add(3);
        linkedList1.add(7);
        linkedList1.add(10);
        linkedList1.add(2, 45);
        //Removing elements in a Linked List
        linkedList1.remove(1);
       // linkedList1.removeFirst();
      //  linkedList1.removeLast();

        Iterator it = linkedList1.iterator();
        while (it.hasNext()){
            System.out.print(it.next() +" ");
        }
        System.out.println();
        System.out.println(linkedList1.size());
        boolean b1 = linkedList1.contains(70);
        System.out.println(b1);
        if (!b1){
            System.out.println("Element not found");
        }

        //Copy Elements from stack to Linked List
        Stack<String> s1 = new Stack<>();
        LinkedList<String> linkedList2 =new LinkedList<>();
        s1.push("Hello");
         s1.push("World");
        linkedList2.addAll(s1);
        Iterator it2 = linkedList2.iterator();
        while (it2.hasNext()){
            System.out.print(it2.next() +" ");
        }


    }
}
