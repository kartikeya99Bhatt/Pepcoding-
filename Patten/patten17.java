n, is  a odd number

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int n=scn.nextInt();
        int star=1;
        int space=n/2;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space;j++){
                if(i==n/2+1)
                  System.out.print("*\t");
                else
                 System.out.print("\t");
            }
            
            for(int j=1;j<=star;j++)
            System.out.print("*\t");
            if(i>n/2)
            {
                star--;
            }
            else
            star++;
            System.out.println();
        }
    }
}
