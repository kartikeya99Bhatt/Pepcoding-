import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
       
       Scanner scn=new Scanner(System.in);
       int num=scn.nextInt();
       int cntDigit=countDigit(num);
         int temp=(int)Math.pow(10,(cntDigit-1));
        while(cntDigit>0)
        {
           int rem=num%temp;
            int que=num/temp;
            System.out.println(que);
            num=rem;
            cntDigit--;
            temp=temp/10;
        }
        
     }
     public static int countDigit(int num)
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
