	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
           Scanner scn=new Scanner(System.in);
           int n=scn.nextInt();
           int []val=new int[n];
           for(int i=0;i<n;i++)
           val[i]=scn.nextInt();
           
           int []wt=new int[n];
           for(int i=0;i<n;i++)
           wt[i]=scn.nextInt();
           
           int cap=scn.nextInt();
           int []dp=new int[cap+1];
           solve(dp,wt,val);
           System.out.println(dp[cap]);
	    }
	    public static void solve(int []dp,int []wt,int []val)
	    {
	        dp[0]=0;
	        
	        for(int i=1;i<dp.length;i++)
	        {
	            for(int j=0;j<wt.length;j++)
	            {
	                if(wt[j]<=i)
	                {
	                    dp[i]=Math.max(dp[i],val[j]+dp[i-wt[j]]);
	                }
	            }
	        }
	    }
	}
