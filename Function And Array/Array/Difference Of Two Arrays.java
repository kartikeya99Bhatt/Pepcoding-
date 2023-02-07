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
    for(int i=0;i<m;i++)
    b[i]=scn.nextInt();
    
    int i=n-1;int j=m-1;
    int br=0;int ans=0;int temp=1;
    while(j>=0)
    {
        int x=(i>=0)?a[i]:0;
        int y=(j>=0)?b[j]:0;
        
        int sub=y-x-br;
        if(sub<0){
         sub=sub+10;
         br=1;
        }
        else{
         br=0;
        }
        ans+=sub*temp;
        temp=temp*10;
        i--;j--;
    }
    StringBuilder sb=new StringBuilder(ans+"");
    for( i=0;i<sb.length();i++)
    System.out.println(sb.charAt(i));
 }

}
