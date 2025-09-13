package Sort012Array;

import java.util.Arrays;


public class Sort012Better {
   
    public static void sortColors(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;

        // Step 1: Count occurrences of 0, 1, and 2
        for (int num : arr) {
            if (num == 0) count0++;
            else if (num == 1) count1++;
            else count2++;
        }

        // Step 2: Fill the array based on counts
        int index = 0;

        while (count0 > 0) {
            arr[index++] = 0;
            count0--;
        }

        while (count1 > 0) {
            arr[index++] = 1;
            count1--;
        }

        while (count2 > 0) {
            arr[index++] = 2;
            count2--;
        }

        // int index = 0;

        // for (int i = 0; i < count0; i++) {
        //     arr[index++] = 0;
        // }

        // for (int i = 0; i < count1; i++) {
        //     arr[index++] = 1;
        // }

        // for (int i = 0; i < count2; i++) {
        //     arr[index++] = 2;
        // }


    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr)); // Output: [0, 0, 1, 1, 2, 2]
    }
}


