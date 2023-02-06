import java.util.*;
public class Main {
public static void main (String []args)
{
    Scanner scn=new Scanner(System.in);
    int num=scn.nextInt();
    int pos=1;
    
    int ans=0;
    
    while(num>0)
    {
        int rem=num%10;
        int newp=(int)Math.pow(10,rem-1);
        ans+=newp*pos;
        num=num/10;
        pos++;
    }
    
    System.out.println(ans);
}
}
