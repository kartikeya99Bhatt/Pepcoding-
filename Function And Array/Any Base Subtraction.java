import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       int ans=0;
       int temp=1;
       int br=0;
       while(n2>0)
       {
           int rem1=n1%10;
           int rem2=n2%10;
           int s=rem2-rem1-br;
           if(s<0){
            s+=b;
            br=1;
           }
           else
           br=0;
           
           ans+=s*temp;
           temp=temp*10;
           n1=n1/10;
           n2=n2/10;
       }
       return ans;
   }
  
  }
