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
   
    for(int i=0;i<(int)Math.pow(2,n);i++)
    {
        int temp=i;
        String str="";
        for(int j=n-1;j>=0;j--)
        {
            int rem=temp%2;
            if(rem==0){
             str="-\t"+str;
            }
            else{
             str=a[j]+"\t"+str;
            }
            temp=temp/2;
        }
        System.out.println(str);
    }
 }

}
