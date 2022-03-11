package Algorithms;

public class Selection_Sort {

    public  static void SelectionSort(int[] a1){
        for (int i = 0 ; i< a1.length;i++){
            int interVar = i;
            for(int j=i+1 ; j< a1.length;j++){
                if (a1[j]<a1[interVar]){
                    interVar= j;

                }
            }
            int swap= a1[i];
            a1[i]= a1[interVar];
            a1[interVar] =swap;
        }
        for (int i =0;i< a1.length;i++){
            System.out.print(a1[i]+ "  ");
        }
    }
    public static void main(String[] args) {
        int a1[] = new  int[]{3,7,8,2,1,9,4};
        SelectionSort(a1);

    }
}
