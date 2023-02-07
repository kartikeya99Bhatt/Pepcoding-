import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
        int n=scn.nextInt();
        int space=0;
        int star=n;
        int is=n-4;
        for(int i=1;i<=n;i++)
        {
            // space
            for(int j=1;j<=space;j++)
            System.out.print("\t");
            // star

            if(i>n/2 || i==1){
                for(int j=1;j<=star;j++)
                System.out.print("*\t");
            }
            else
            {
                System.out.print("*\t");
                for(int j=1;j<=is;j++){
                 System.out.print("\t");
                }
                System.out.print("*\t");
            }
            if(i>n/2)
            {
                space--;
                star+=2;
            }
            else
            {
                space++;
                star-=2;
                if(i!=1)
                is-=2;
            }
            System.out.println();
        }
 }
}
