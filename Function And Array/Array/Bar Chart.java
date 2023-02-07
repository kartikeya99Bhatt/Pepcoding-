import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []a=new int[n];
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        a[i]=scn.nextInt();
        max=Math.max(max,a[i]);
    }
    for(int i=max;i>=1;i--)
    {
        for(int j=0;j<n;j++)
        {
            if(a[j]>=i)
            System.out.print("*\t");
            else
            System.out.print("\t");
        }
        System.out.println();
    }
 }

}
