import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax: datatype[] variableName= new dataytype[size];
        int[] arr = { 5,4,3,2,1 };
       
        
       
        //to print all elements of the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            int[] arr1 = new int[5];

            //to take input using for loop
            for (int l = 0; l < arr1.length; l++) {
                arr1[l] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr1)); //sout(arr1) will give the memory address of the array

            //2-Dimensional array

            int[][] arr2 = { { 1, 2, 3 }, { 2, 4 }, { 2, 3, 4 } };

            //taking input from user
            int[][] arr3 = new int[3][3]; // 3x3 matrix

            // Input
            for (int k = 0; k < 3; k++) {
                for (int p = 0; p < 3; p++) {
                    arr3[k][p] = sc.nextInt();
                }
            }

            //print 2d array 

            // Outer loop: goes through each row (k is row index)
            for (int k = 0; k < arr2.length; k++) {
                //Inner loop: goes through each column in the current row
                for (int j = 0; j < arr2[k].length; j++) {
                    System.out.print(arr2[k][j]);
                }
                System.out.println();
            }
        }
        
}

   

}
