public class SecondLargest {

    public static void secondLargest(int[] arr) {
        int largest = arr[0];
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondlargest && arr[i] < largest) {
        // Current element is not largest but bigger than secondlargest, update secondlargest
          secondlargest = arr[i];
        }
    }
        System.out.println("Second Largest element is " + secondlargest);
    }

    public static void main(String[] args) {
        int[] arr = { 32, 12, 53, 64, 124 };
        secondLargest(arr);
    }

}

