//parameterized recursion
public class ArrayReverse {

    static void reverse(int[] arr, int start, int end) {
        if (start >= end)
            return;

        // swap elements at start and end
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1); // move toward center
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr, 0, arr.length - 1);

        // print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



