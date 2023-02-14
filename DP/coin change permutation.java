import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int target=scn.nextInt();
        int []dp=new int[target+1];
        solve(arr,dp);
        System.out.println(dp[target]);
    }
    public static void solve(int []arr,int []dp)
    {
        dp[0]=1;
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                dp[i]+=(i-arr[j])>=0?dp[i-arr[j]]:0;
            }
        }
    }
}
