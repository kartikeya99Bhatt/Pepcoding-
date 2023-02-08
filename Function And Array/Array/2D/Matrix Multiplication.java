import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int m1=scn.nextInt();
    int [][]a=new int[n1][m1];
    for(int i=0;i<n1;i++)
    {
        for(int j=0;j<m1;j++){
            a[i][j]=scn.nextInt();
        }
    }
    
    int n2=scn.nextInt();
    int m2=scn.nextInt();
    int [][]b=new int[n2][m2];
    for(int i=0;i<n2;i++)
    {
        for(int j=0;j<m2;j++)
        {
            b[i][j]=scn.nextInt();
        }
    }
    if(m1!=n2)
    {
        System.out.println("Invalid input");
    }
    else
    {
           for(int i=0;i<n1;i++)
            {
                for(int j=0;j<m2;j++)
                {
                    int ans=0;
                    for(int k=0;k<n2;k++)
                    {
                        ans=ans+a[i][k]*b[k][j];
                    }
                    System.out.print(ans+" ");
                }
                System.out.println();
            }
    }
   
 }

}
