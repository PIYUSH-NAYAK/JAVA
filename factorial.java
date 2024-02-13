import java.util.*;
public class factorial {
    public static void calculateFactorial(int n){
        int p=1;
        for(int i=2;i<=n;i++){
            p=p*i;
        }
        System.out.println("factorial of "+n+ " is "+ p );
    }
    public static void main(String[] args) {
        Scanner p =new Scanner(System.in);
        System.out.print("Enter the number for calculating factorial: ");
        int n=p.nextInt();
        calculateFactorial(n);
        p.close();
    }
}
