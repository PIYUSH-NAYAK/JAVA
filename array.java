public class array {
    public static void main(String[] args) {
        // 1d array
        int arr1[]={1,2,3,4};
        for(int i=0;i<4;i++)
        {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        
        // 2d array
        
        int arr2[][]={{1,2,3,4},{5,6,7,8}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(arr2[i][j] + " ");
            }
        }

        // 3d array
        int arr3[][][]= {{{1,2,3,4},{5,6,7,8}},{{1,2,3,4},{5,6,7,8}}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<4;k++)
                {
                    System.out.print(arr3[i][j][k]);
                }
                System.out.println();
            }
        }
        
        
    }
}
