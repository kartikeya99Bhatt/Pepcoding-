import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int ans=climbStairs(n);
        System.out.println(ans);
    }
     public static int climbStairs(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
        int f1=climbStairs(n-1);
        int f2=climbStairs(n-2);
        int f3=climbStairs(n-3);
        return (f1+f2+f3);
    }

}
