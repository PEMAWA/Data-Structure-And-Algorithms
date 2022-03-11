package Algorithms;

public class Insertion_Sort {

    public  static  void insertionSort(int [] a1){
        for (int i= 0 ; i< a1.length; i++){
            int j = i-1;
            int b=a1[i];
            while (j>=0 && b<=a1[j]){
                a1[j+1] = a1[j];
                j=j-1;
            }
            a1[j+1]=b;
        }
        for (int i =0;i< a1.length;i++){
            System.out.println(a1[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int a1[] = new  int[]{9,6,7,2,6,3,1,8};
        insertionSort(a1);

    }
}
