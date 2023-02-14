import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=scn.nextInt();
            }
        }
        int [][]dp=new int [n][m];
        solve(arr,dp);
        int max=dp[0][0];
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,dp[i][0]);
        }
        System.out.println(max);
    }
    static int [][]dir={{-1,1},{0,1},{1,1}};
    public static void solve(int [][]arr,int [][]dp)
    {
        for(int j=arr[0].length-1;j>=0;j--)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(j==arr[0].length-1)
                {
                    dp[i][j]=arr[i][j];
                }
                else 
                {
                    int max=Integer.MIN_VALUE;
                    for(int k=0;k<dir.length;k++)
                    {
                        int row=i+dir[k][0];
                        int col=j+dir[k][1];
                        if(row>=0 && row<arr.length && col>=0 && col<arr[0].length)
                        {
                            max=Math.max(max,dp[row][col]);
                        }
                    }
                    dp[i][j]=max+arr[i][j];
                }
            }
        }
    }

}
