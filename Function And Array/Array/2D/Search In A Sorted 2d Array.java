import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [][]a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=scn.nextInt();
            }
        }
        int x=scn.nextInt();
        
        int r=0;int c=n-1;
        boolean flag=false;
        while(c>=0 && r<n)
        {
            if(a[r][c]>x)
            {
                c--;
            }
            else if(a[r][c]<x)
            {
                r++;
            }
            else if(a[r][c]==x)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        System.out.println(r+"\n"+c);
        else
        System.out.println("Not Found");
    }

}
