// Take an array as input from the user. Search for a  given number x and print the index at which it occurs


import java.util.*;

public class ques {

    
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=s.nextInt();
        int []arr = new int[size];
        
        // arrInput(size);
        for(int i=0;i<size;i++)
        {
            
            System.out.print("Enter the element: ");
            arr[i]=s.nextInt();
        }

        System.out.print("Your array: " );

        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
            
        }



        s.close();
    }

}
