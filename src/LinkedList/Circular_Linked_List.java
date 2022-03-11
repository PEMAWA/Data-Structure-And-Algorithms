package LinkedList;



public class Circular_Linked_List {
    Node head,tail;
    class Node{
        int data;
        Node next;
        Node tail;
        Node(int data){
            this.data=data;
        }
    }
    void  insertElements(int data){
        Node newNode= new Node(data);
        if (head==null){
            head=newNode;
            tail=newNode;
            tail.next=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    void display(){
        Node n1 =head;
        if(tail==null && head== null){
            System.out.println("The Circular Linked List is Empty, nothing to display");
        } else {
            do {
                System.out.println(n1.data);
                n1=n1.next;

            } while (n1 != head);
        }
    }
    void  deleteElements(){
        if(tail != head){
          head=head.next;
          tail.next=head;

        }else {

        }
    }


    public static void main(String[] args) {
        Circular_Linked_List l1 = new Circular_Linked_List();
        l1.insertElements(5);
        l1.insertElements(6);
        l1.insertElements(8);
        l1.display();
        l1.deleteElements();
        System.out.println();
        l1.display();

    }
}
