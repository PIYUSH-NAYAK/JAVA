import java.util.Scanner;

class conditional {
    public static void main(String[] args) {
        // IF ELSE

        Scanner p = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = p.nextInt();
        if (age >= 18) {
            System.out.println("YOU are able to vote:)");

        } else {
            System.out.println("YOU are Nabalik");
        }
        System.out.println("Enter a number:) ");
        int num = p.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is a even number");
        else {
            System.out.println(num + " is a odd number");
        }

        // SWITCH CASE
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter any number from the following: 1 , 2 , 3 or 4 to exit :)");

            int button = p.nextInt();
            switch (button) {
                case 1:
                    System.out.println("HI");
                    break;
                case 2:
                    System.out.println("HELLO");
                    break;
                case 3:
                    System.out.println("BIRADAR");
                    break;
                case 4:
                    System.out.println("exiting bye bye");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid number");
                    break;
            }
        }

        p.close();
    }
}
