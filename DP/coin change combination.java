import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
      
        for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
        
        int tar=scn.nextInt();
        int []dp=new int[tar+1];
       
        solve(arr,dp);
        System.out.println(dp[tar]);
    }
    public static void solve(int []arr,int []dp)
    {
        dp[0]=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=arr[i];j<dp.length;j++)
            {
                dp[j]+=dp[j-arr[i]];
            }
        }
       
      
    }
}
