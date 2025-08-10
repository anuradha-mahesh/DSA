public class Print1ToN {

    static void printName(String name, int i, int n) {
        if (i > n) return; // base case

        System.out.println(name + " " + i); // print while going down
        printName(name, i + 1, n); // recursive call
    }

    public static void main(String[] args) {
        String name = "Anuradha";
        int n = 3;

        printName(name, 1, n);
    }
}
