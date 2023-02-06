n is a odd number

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
       int n=scn.nextInt();
       int space=n/2;
       int star=1;
       int cnt=1;
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=space;j++)
           System.out.print("\t");
           
             int val=cnt;
           for(int j=1;j<=star;j++){
               System.out.print(val+"\t");
              if(j>star/2)
                val--;
              else
               val++;  
           }
           
           if(i>n/2)
           {
               space++;
               star-=2;
               cnt--;
           }
           else
           {
               star+=2;
               space--;
               cnt++;
           }
           System.out.println();
       }
    }
}
