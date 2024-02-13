public class loops {
    public static void main(String[] args) {
        for(int i=1;i<6;i++)
        {
            break;
            // System.out.println("Hello World");
        }
        for(int i=0;i<=10;i++)
        {
            // System.out.print(i + " ") ;
        }
        boolean p=false;
        int j=0;
        while (!p) {

            // System.out.println( j);
            j++;
            if(j>10)
            {
                p=true;
            }
            
        }
        System.out.println();
        System.out.println();
        System.out.println();
        int s=1;

        do{
            // System.out.print(s+" ");
            s++;



        }while(s<0);

        int sn=1;
        for(int i=2;i<=4;i++)
        {
            sn+=i;
        }
        System.out.println(sn);

        
    }
}
