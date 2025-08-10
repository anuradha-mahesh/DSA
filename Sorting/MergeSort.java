import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    
    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
       }

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }
    
    
    
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 6, 9, 1, 3, 6, 2, 32, 52 };
        System.out.println("before sorting: "+ Arrays.toString(arr1));
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("After sorting: " + Arrays.toString(arr1));
    }
}
