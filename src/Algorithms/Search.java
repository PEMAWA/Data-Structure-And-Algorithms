package Algorithms;

public class Search {

    public static  int binarySearch(int [] a1, int key,int first,int last){
        int midElement = (first+last)/2;
        if (first<= last){
            if (key==a1[midElement]){
                return midElement;
            }
                if(key<a1[midElement]){
                        return binarySearch(a1,key,first,midElement-1);
                }else {
                    return binarySearch(a1, key, midElement + 1, last);


            }

        }
        return  -1;
    }


    public static void main(String[] args) {
        int a1 []= new int[]{1,2,3,4,5,6,7,8,9};
        int index= binarySearch(a1,7,0,a1.length-1);
        if (index==-1){
            System.out.println("element not found in the given array");
        }else
            System.out.println("Element found at index "+index);

    }
}
