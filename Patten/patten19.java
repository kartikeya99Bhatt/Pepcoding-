n , is always odd 

import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     
     for(int r=1;r<=n;r++)
     {
         for(int c=1;c<=n;c++)
         {
             if(r==1 && c<=n/2)
              System.out.print("*\t");
              
              else if(r>n/2+1 && c==1)
                System.out.print("*\t");
                
                else if(c>n/2+1 && r==n)
                  System.out.print("*\t");
                  
                  else if(r<=n/2 && c==n)
                   System.out.print("*\t");
             // middle lines
            else if(r==n/2+1 || c==n/2+1)
               System.out.print("*\t");
               else
               System.out.print("\t");
         }
         System.out.println();
     }

 }
}
