package LinearSearch;

public class LinearSearch {

    public static int linearSearch(int[] arr,int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; // found, return index
            }
        }
        return -1; // only return -1 after checking all elements
    }
    
    public static void main(String[] args) {
        int arr[] = { 1,22,33,12,24,36,48,56,102,256,98};
        System.out.println(linearSearch(arr,33)); // should print 2
    }
}


