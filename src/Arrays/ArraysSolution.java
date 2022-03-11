package Arrays;

public class ArraysSolution {
    public static void main(String[] args) {

        //int [] a1= new int[6];
       int count= 1;
        //Declaring a one dimension array
        //for (int i=0 ; i< a1.length;i+=1){
           // a1[i] = count;
        // count++;

            // storing values in the array
       /// }
        //for(int j =0 ; j< a1.length;j+=1){
           // System.out.println(a1[j] + " ");

            // accessing the values in the array
       // }

       // Creation of a two dimension array

        int [][] a2 = new int[3][4];

        for (int i = 0;i<a2.length;i++){
            for (int j =0 ;j <a2[i].length;j++){
                a2[i][j] = count;
                count++;
            }
        }
        for (int i = 0;i<a2.length;i++) {
            for (int j = 0; j < a2[i].length; j++) {
                System.out.print(a2[i][j] + "  ");
            }
            System.out.println();

            }
        }

}
