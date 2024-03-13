public class bubbleSort {

    // public static void main 
    public static void main(String[] args) {
        int arr[]={1,4,6,1,2,9,4,5,6,7,8};
        int p=0;
        int len=arr.length;
        while(p==0){
            for(int i=0;i<len-1;i++)
            {
                if(arr[i]>arr[i+1]){
                    int t=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=t;
                    p++;


                }
            }


            
        }
    }
    public class insertionSort {
        public static void sort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6};
            sort(arr);
            System.out.println("Sorted array:");
            for(int i=0;i<arr.length;i++) {
                System.out.print(i + " ");
            }
        }
    }
    
}
