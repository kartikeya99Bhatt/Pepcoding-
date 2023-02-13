// RECURSION

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int ans=getFibb(n);
    System.out.println(ans);
 }
 public static int getFibb(int n)
 {
     if(n==0|| n==1) return n;
     int f1=getFibb(n-1);
     int f2=getFibb(n-2);
     return (f1+f2);
 }

}

// MEMOIZATION

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []dp=new int[n+1];
    fibbMemoization(n,dp);
    System.out.println(dp[n]);
 }
 public static void fibbMemoization(int n,int []dp)
 {
     if(n==0||n==1) return n;
     
     else if(dp[n]!=0)return dp[n];
     
     int f1=fibbMemoization(n-1,dp);
     int f2=fibbMemoization(n-2,dp);
     
     dp[n]=f1+f2;
     return dp[n];
 }
