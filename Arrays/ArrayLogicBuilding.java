import java.util.Arrays;

public class ArrayLogicBuilding {

   //Find largest or smallest element
    static int max(int[] arr) {
     int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    

    //Add all elements
    static int sumCAL(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }




    //Swap using two-pointer
    static void swap(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    




    //Count frequency Of elements or characters
    static int countCAL(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        return count;
    }



    // Check sorted	Ascending
    static void checkSortedAsc(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("the array is sorted in ascending order");
        } else
            System.out.println("array is not sorted in ascending order");
    }

    

       //Check sorted Descending
       static void checkSortedDes(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i <= arr.length - 2; i++) {
            if (arr[i] < arr[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("the array is sorted in descending order");
        } else
            System.out.println("array is not sorted in descending order");
    }





   //make a copy of array
    public static void copyArray(int[] original) {
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println(Arrays.toString(copy));
    }

    




    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
         System.out.println(max(arr));
        System.out.println(sumCAL(arr));
        swap(arr);
        System.out.println(countCAL(arr));
        checkSortedAsc(arr);
        checkSortedDes(arr);
        copyArray(arr);
    }
}
