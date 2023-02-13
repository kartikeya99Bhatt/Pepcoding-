//Recursion
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
// MEMOIZATION
 public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []dp=new int[n+1];
        int ans=climbStairs(n,dp);
        System.out.println(ans);
    }
     public static int climbStairs(int n,int []dp)
    {
        if(n==0)
        {
            return 1;
        }
        else if(n<0)
        {
            return 0;
        }
        else if(dp[n]!=0)
        {
            return dp[n];
        }
        int f1=climbStairs(n-1,dp);
        int f2=climbStairs(n-2,dp);
        int f3=climbStairs(n-3,dp);
        dp[n]=f1+f2+f3;
        return dp[n];
    }

//TABULATION
 public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        climbStairs(n,dp);
        System.out.println(dp[n]);
    }
     public static void climbStairs(int n,int []dp)
    {
       for(int i=2;i<=n;i++)
       {
        int val=( (i-1<0)?0:dp[i-1] ) + ( (i-2<0)?0:dp[i-2] ) + ( (i-3<0)?0:dp[i-3]);
        dp[i]=val;
       }
    }
