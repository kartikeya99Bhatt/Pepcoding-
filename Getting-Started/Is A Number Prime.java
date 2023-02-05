import java.util.*;
public class Main{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        int t=scn.nextInt();
        for(int i=0;i<t;i++)
        {
            int num=scn.nextInt();
            if(num<2)System.out.println("not prime");
            else
            {
                boolean flag=true;
                for(int j=2;j<=(int)Math.sqrt(num);j++)
                {
                    if(num%j==0)
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag==false)
                {
                    System.out.println("not prime");
                    continue;
                }
                System.out.println("prime");
            }
        }
    }
}
