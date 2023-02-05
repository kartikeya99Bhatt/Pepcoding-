import java.util.*;
public class Main {
    public static void main (String []args)
    {
        Scanner scn=new Scanner(System.in);
        int num=scn.nextInt();
        int cnt=0;
        while(num>0)
        {
            int rem=num%10;
            num=num/10;
            cnt++;
        }
        System.out.println(cnt);
    }
}
