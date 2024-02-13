import java.util.*;

public class exercise1 {
    // Question 1
    public static void calAverage(int a, int b, int c) {
        System.out.println((a + b + c) / 3);
    }

    // Question 2
    public static void printOddNum(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            i++;
        }
    }

    // Question 3
    public static void findGreatest(int a, int b) {
        if (a > b)
            System.out.println(a + " is greater than " + b);
        else if (a < b)
            System.out.println(b + " is greater than " + a);
    }

    // Question 4
    public static void findCircum(int a) {
        System.out.println("The circumference of given circle is " + (2 * 3.14 * a));
    }

    // Question 7
    public static void findGcd(int a, int b) {
        int k = 1;
        if (a < b) {
            for (int i = 2; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    k = i;
                }
            }
        }
        else if(a > b)
        {
            for (int i = 2; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    k = i;
                }
            }
        }
         System.out.println("The GCD of "+a +" and "+ b+ " is " + k);

    }

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        // Question 1
        System.out.println("Enter value of a,b,c");
        int a = p.nextInt();
        int b = p.nextInt();
        int c = p.nextInt();
        calAverage(a,b,c);

        // Question 2
        System.out.println("enter the value of n: ");
        int n=p.nextInt();
        printOddNum(n);
        // p.close();

        // Question 3
        System.out.println("Enter value of a and b");
        int a1 = p.nextInt();
        int b1 = p.nextInt();

        findGreatest(a1,b1);

        // Question 4
        System.out.println("Enter the radius of circle: ");
        int rad = p.nextInt();
        findCircum(rad);

        // Question 5
        System.out.println("enter the how many number do you want to enter: ");
        int a2=p.nextInt();
        int x=0,y=0,z=0;
        for(int i=0;i<a2;i++)
        {
        System.out.print("Enter number: ");
        int k=p.nextInt();
        if(k>0)
        x++;
        else if(k==0)
        z++;
        else
        y++;
        }

        System.out.println("number of positive integers: "+ x);
        System.out.println("number of negative integers: "+ y);
        System.out.println("number of zeros: "+z);

        // Question 6

        System.out.println("Enter value of x ");
        int x1 = p.nextInt();
        System.out.println("Enter value of n: ");
        int n1 = p.nextInt();
        double result = Math.pow(x1, n1);
        // int p2=x1;
        // for(int i=1;i<n1;i++)
        // {
        // p2*=x1;
        // }
        System.out.println("Ans is "+ result);

        // Quetion 7

        System.out.println("Enter two number: ");
        int a3 = p.nextInt();
        int b2 = p.nextInt();
        findGcd(a3, b2);

        // Question 8

        System.out.println("Enter vlaue of n: ");
        int n4=p.nextInt();
        int u=0;
        int v=1;
        int next =0;
        System.out.print("Your fibonaaci series: " + u+" "+ v +" ");
        for(int i=1;i<n4-1;i++)
        {
            next=u+v;
            System.out.print( next + " ");
            u=v;
            v=next;
        }

        p.close();
    }

}
