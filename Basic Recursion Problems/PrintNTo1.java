public class PrintNTo1 {
    public static void printNto1(String name, int count, int num) {
          if(count>num)
              return;

          printNto1(name, count + 1, num);
              System.out.println(name+" "+count);
    }
    
    public static void main(String[] args) {
        printNto1("Anu", 1, 10);
    }
}
