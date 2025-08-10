import java.util.Arrays;
import java.util.List;

public class ArrayClass{
    public static void main(String[] args) {
      
        // 1. sort()
        int[] arr = {5, 3, 1, 4, 2};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr)); // [1, 2, 3, 4, 5]

        // 2. sort(fromIndex, toIndex)
        int[] partialArr = {5, 4, 3, 2, 1};
        Arrays.sort(partialArr, 1, 4);
        System.out.println("Partially sorted: " + Arrays.toString(partialArr)); // [5, 2, 3, 4, 1]

        // 3. toString()
        System.out.println("Using toString: " + Arrays.toString(arr));

        // 4. equals()
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println("Are a and b equal? " + Arrays.equals(a, b)); // true

        // 5. fill()
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 7);
        System.out.println("Filled array: " + Arrays.toString(fillArr)); // [7, 7, 7, 7, 7]

        // 6. binarySearch() - only on sorted array
        int[] bsArr = {1, 3, 5, 7};
        int index = Arrays.binarySearch(bsArr, 5);
        System.out.println("Index of 5: " + index); // 2

        // 7. copyOf()
        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5);
        System.out.println("Copied array: " + Arrays.toString(copy)); // [1, 2, 3, 0, 0]

        // 8. copyOfRange()
        int[] rangeCopy = Arrays.copyOfRange(original, 1, 3);
        System.out.println("Range copied: " + Arrays.toString(rangeCopy)); // [2, 3]

        // 9. asList()
        String[] strArr = {"A", "B", "C"};
        List<String> list = Arrays.asList(strArr);
        System.out.println("List from array: " + list); // [A, B, C]

        // 10. deepToString() - for 2D array
        int[][] twoD = {{1, 2}, {3, 4}};
        System.out.println("2D Array: " + Arrays.deepToString(twoD)); // [[1, 2], [3, 4]]
    }
}

    