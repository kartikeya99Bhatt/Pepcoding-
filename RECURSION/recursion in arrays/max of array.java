import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        System.out.println(maxOfArray(a,0));
    }

    public static int maxOfArray(int[] arr, int idx){
      if(idx==arr.length-1)return arr[idx];
       int val=arr[idx]
       int getMax=maxOfArray(arr,idx+1);
       int maxIs=Math.max(val,getMax);
       return maxIs;
    }

}
