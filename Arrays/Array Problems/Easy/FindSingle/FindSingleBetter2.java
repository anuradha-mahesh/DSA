package FindSingle;

public class FindSingleBetter2 {
    
    public static int findSingleBetter2(int[] arr) {
        int maxi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        int[] hash = new int[maxi + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (hash[arr[i]] == 1) {
                return arr[i];
            }
        }
        return -1;
    }
    
     public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans =  findSingleBetter2(arr);
        System.out.println("The single element is: " + ans);

    }
}
