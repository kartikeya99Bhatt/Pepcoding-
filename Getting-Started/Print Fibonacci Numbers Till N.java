import java.util.*;
public class Main{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ft=0;
        int sd=1;
        System.out.println(ft);
        System.out.println(sd);
        for(int i=3;i<=n;i++)
        {
            int td=ft+sd;
            System.out.println(td);
            ft=sd;
            sd=td;
        }
    }
}
