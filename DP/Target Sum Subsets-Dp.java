import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         int []arr=new int[n];
         for(int i=0;i<n;i++)
         arr[i]=scn.nextInt();
         int target=scn.nextInt();
         
         boolean [][]dp=new boolean[n+1][target+1];
         solve(arr,dp);
         System.out.println(dp[n-1][target]);
         
        
    }
    public static void solve(int []arr,boolean [][]dp)
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                if(j==0)
                 dp[i][j]=true;
                
                else if(i==0)
                 dp[i][j]=false;
                 
                 else
                 {
                     if(dp[i-1][j]==true)
                     {
                         dp[i][j]=true;
                     }
                     else 
                     {
                         dp[i][j]=(j-arr[i-1])>=0?dp[i-1][j-arr[i-1]]:false;
                     }
                 }
            }
        }
    }
}
