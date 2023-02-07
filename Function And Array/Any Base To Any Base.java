import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int val=AnyToDecimal(n,sourceBase);
     int ans =DecimalToAnyBase(val,destBase);
     System.out.print(ans);
   }   
   public static int AnyToDecimal(int n,int b)
   {
       int ans=0;int temp=0;
       while(n>0)
       {
           int rem=n%10;
           ans+=rem*(int)Math.pow(b,temp);
           temp++;
           n=n/10;
       }
       return ans;
   }
   public static int DecimalToAnyBase(int n,int b)
   {
       int ans=0;int temp=1;
       
       while(n>0)
       {
           int rem=n%b;
           ans+=rem*temp;
           n=n/b;
           temp*=10;
       }
        return ans;
   }
  }
