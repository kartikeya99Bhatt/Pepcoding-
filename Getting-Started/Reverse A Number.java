import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn=new Scanner(System.in);
     int num=scn.nextInt();
     
     while(num>0)
     {
         int rem=num%10;
         num=num/10;
         System.out.println(rem);
     }
    }
   }
