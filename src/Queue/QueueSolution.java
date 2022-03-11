package Queue;


class QueueUsingArrays{
   int front_Q,rear_Q;
   int capacityOfQueue;
   static int [] q1;
   QueueUsingArrays(int size){
       capacityOfQueue=size;
       q1=new int[capacityOfQueue];

   }
   void enqueue(int value){
       if(rear_Q==capacityOfQueue){
           System.out.println("Queue is already full, you cannot insert element");
       }else {
           q1[rear_Q]=value;
           rear_Q++;
       }
   }
   void dequeue(){
       if(rear_Q ==0){
           System.out.println("Queue is empty, There is nothing to delete");
       }else {
           for(int i =0;i<rear_Q-1;i++){
               q1[i]=q1[i+1];
           }
           rear_Q--;
       }
   }
   void  display(){
       if(rear_Q ==0){
           System.out.println("Queue is empty, There is nothing to display");
       }else{
          for(int i =0;i<rear_Q;i++){
              System.out.print(q1[i] +" ");
          }
       }

   }
}
public class QueueSolution {
    public static void main(String[] args) {
        QueueUsingArrays queueUsingArrays =new QueueUsingArrays(5);
        queueUsingArrays.enqueue(8);
        queueUsingArrays.enqueue(6);
        queueUsingArrays.enqueue(9);

       // queueUsingArrays.display();
        queueUsingArrays.dequeue();
        System.out.println();
        queueUsingArrays.display();

    }
}
