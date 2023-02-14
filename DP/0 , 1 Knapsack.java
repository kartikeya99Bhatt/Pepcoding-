import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       
       Scanner scn=new  Scanner(System.in);
      
       int n=scn.nextInt();
       int []val=new int[n];
       for(int i=0;i<n;i++)
       val[i]=scn.nextInt();
       
       int []wt=new int[n];
       for(int i=0;i<n;i++)
       wt[i]=scn.nextInt();
       
       int cap=scn.nextInt();
       
       int [][]dp=new int[n+1][cap+1];
       solve(wt,val,dp);
       System.out.println(dp[n][cap]);
    }
    public static void solve(int []wt,int []val,int [][]dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(i==0)
                 dp[i][j]=0;
                 
                else if(j==0)
                 dp[i][j]=0;
                 
                 else
                 {
                     if(j<wt[i-1])
                     dp[i][j]=dp[i-1][j];
                     
                     else
                     dp[i][j]=Math.max( dp[i-1][j] , (val[i-1]+dp[i-1][j-wt[i-1]]) );
                 }
            }
        }
    }
}
