import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn=new Scanner(System.in);
     int num=scn.nextInt();
     int k=scn.nextInt();
     int cntDigit=NumberOfDigit(num);
     k=k%cntDigit;
     if(k<0)
     {
         k=k+cntDigit;
         k=k%cntDigit;
     }
     int temp=(int)Math.pow(10,k);
     int n1=num%temp; // forward
     int n2=num/temp;
     if(n1==0)
     {
         System.out.println(n2);
     }
     else
     System.out.println(n1+""+n2);
    }
    public static int NumberOfDigit(int num)
    {
        int cnt=0;
        while(num>0)
        {
            num=num/10;
            cnt++;
        }
        return cnt;
    }
   }
