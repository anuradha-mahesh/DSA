public class FindSingleOptimal {

    public static int findSingleOptimal(int[] arr) {
        int xor = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xor = xor ^ arr[i];  // keep XOR-ing all elements
        }
        return xor;  // return after loop finishes
    }
    
    public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans =  findSingleOptimal(arr);
        System.out.println("The single element is: " + ans);
    }
}
