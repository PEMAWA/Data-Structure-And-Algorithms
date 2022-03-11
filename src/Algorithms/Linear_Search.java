package Algorithms;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        int  a1[] = new  int []{5,8,9,6,7,4,2};

        Scanner s1 = new Scanner(System.in);
        int count =0;
        System.out.println(" Enter the element to be searched");
        int key = s1.nextInt();
        for (int i= 0; i< a1.length; i++){
            if (a1[i]== key){
                System.out.println("Element is found at index " +i);
                count++;
            }
            }if (count==0) {
            System.out.println("Element not found");
        }

    }

}
