import java.util.*;

public class input {
    public static void main(String[] args) {
        Scanner p1 =new Scanner(System.in);
        System.out.print("Enter your name: ");
        // use nextline to take input more than one word and next for simgle word
        String name = p1.nextLine();

        System.out.print("Enter your age: ");
        int age = p1.nextInt();
        System.out.println("Your name and age are: " + name+ " " + age);

        p1.close();
    }
}
