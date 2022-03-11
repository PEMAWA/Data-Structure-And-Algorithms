package Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackSolution {
    public static void main(String[] args) {
        //Create Stack s1
        Stack <Integer> s1 = new Stack<>();
        //Inserting element in S1
        s1.push(2);
        s1.push(11);
        s1.push(9);
        s1.sort(null);
        System.out.println(s1);

        System.out.println(s1);
        //Deleting element in  s1
        s1.pop();
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.push(45);
        System.out.println(s1);
        //Looking into top element
        System.out.println(s1.peek());
        boolean status =s1.empty();
        System.out.println(status);

        //Search
        int indexFound = s1.search(2);
        System.out.println(indexFound);
//How to iterate over a stack
        Iterator it =s1.iterator();
        while (it.hasNext()){
            Object s2= it.next();
            System.out.print(s2 +" ");
        }
        System.out.println();
        System.out.println(s1.size());

    }
}
