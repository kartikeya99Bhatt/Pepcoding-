import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++){
        a[i]=scn.nextInt();
    }
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    
    for(int i=0;i<n;i++)
    {
        max=Math.max(max,a[i]);
        min=Math.min(min,a[i]);
    }
    System.out.println(max-min);
 }

}
