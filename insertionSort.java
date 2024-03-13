import java.util.*;
public class insertionSort{
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of element in array: ");
        n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter element: ");
            arr[i]=sc.nextInt();
            // System.out.println();

        }

        // int arr[]={3,6,1,3,8,2,9,6,5};
        // int n=arr.length;
        for(int i=0;i<n;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]> current)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=current;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        // int first=
        sc.close();
    }

}