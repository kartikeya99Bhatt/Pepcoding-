import java.util.*;
public class Main {
public static void main (String []args)
{
    Scanner scn=new Scanner(System.in);
    int a=scn.nextInt();
    int b=scn.nextInt();
    
    int HCF=GCD(a,b);
    int LCM=(a*b)/HCF;
    
    System.out.println(HCF +"\n" +LCM);
}
public static int GCD(int a,int b)
{
    while(b!=0)
    {
        int rem=a%b;
        int que=a/b;
        a=b;
        b=rem;
    }
    return a;
}
}
