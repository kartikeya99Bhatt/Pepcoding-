import java.util.*;
public class Main{
    public static void main (String []args)
    {
        Scanner scn=new Scanner(System.in);
        int lo=scn.nextInt();
        int hi=scn.nextInt();
        
        for(int i=lo;i<=hi;i++)
        {
            if(isNumberPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isNumberPrime(int num)
    {
        for(int i=2;i<=(int)Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
