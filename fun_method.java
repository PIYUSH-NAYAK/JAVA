import java.util.*;
public class fun_method {
    public static void printName(String name) {
        System.out.println("My name is "+ name);
    }
    public static int calculateSum(int a,int b) {
        int c =a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner p =new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = p.nextLine();
        printName(name);
        System.out.println("Enter value of a: ");
        int a =p.nextInt();
        System.out.println("Enter value of b: ");
        int b =p.nextInt();
        int s= calculateSum(a, b);
        System.out.println("The summation of "+ a+" and "+b+ " is "+ s);
        p.close();
    }
    
}
