package Arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
       int [] a1 = new int[] {15,85,14,63,85,12,85,2,4,6,5,100};
       for(int i = 0 ;i<a1.length;i++){
           System.out.print(a1[i]+" ");
       }
        Arrays.sort(a1);
        System.out.println();
        for(int i = 0 ;i<a1.length;i++){
            System.out.print(a1[i]+"  ");
        }
        int indexValue = search(a1,130);
        if (indexValue== -1){
            System.out.println("Element cannot be found");
        }else {
            System.out.println("Element is found at index "+indexValue);
        }

    }
    public static int search (int array[] , int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }

        }
        return  -1;

    }
}
