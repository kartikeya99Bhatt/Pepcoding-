import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     int n=scn.nextInt();
     int space=2*n-3;
     
     for(int i=1;i<=n;i++)
     {
         // forward counting 
         for(int j=1;j<=i;j++){
         System.out.print(j+"\t");
         }
         // space
         for(int j=1;j<=space;j++){
         System.out.print("\t");
         }
         //backward counting 
         int j=(i==n)?i-1:i;
        
         for(;j>=1;j--){
         System.out.print(j+"\t");
         }
         space-=2;
         System.out.println();
     }

 }
}
