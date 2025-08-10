//print name N times using recursion

public class PrintName {
    static void printName(String Name,int count,int num) {
        if (num > count) {
            return;
        }
        System.out.println("Hello " + Name +" " +num);
        num++;
        printName(Name,count,num);
    }

    public static void main(String[] args) {
        printName("Anuradha",10,1);
        
    }
}