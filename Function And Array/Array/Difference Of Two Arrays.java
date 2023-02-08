// given a2>a1(a2-a1)
import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=scn.nextInt();
    
    int m=scn.nextInt();
    int []b=new int[m];
    for(int j=0;j<m;j++)
    b[j]=scn.nextInt();
    
    int k=Math.max(n,m);
    int []c=new int[k];
    k--;int br=0;
    int i=n-1;int j=m-1;
    while(k>=0)
    {
        int x=(i>=0)?a[i]:0;
        int y=(j>=0)?b[j]:0;
        
        int sub=y-x-br;
        if(sub<0){
        sub+=10;
        br=1;
        }
        else
        br=0;
        
        c[k]=sub;
        k--;i--;j--;
    }
     i=0;
    while(c[i]==0)
    {
        i++;
    }
    while(i<c.length)
    {
        System.out.println(c[i++]);
    }
    
 }

}
