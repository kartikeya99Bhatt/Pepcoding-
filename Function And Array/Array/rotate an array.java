import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  public static void Reverse(int []a,int i,int j)
  {
      while(i<j)
      {
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          i++;j--;
      }
  }

  public static void rotate(int[] a, int k){
    // write your code here
    k=k%a.length;
    if(k<0)
    {
        k=k+a.length;
    }
    Reverse(a,0,a.length-k-1);
    Reverse(a,a.length-k,a.length-1);
    Reverse(a,0,a.length-1);
  }

public static void main(String[] args) throws Exception {
  Scanner scn=new Scanner(System.in);

    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] =  scn.nextInt();
    }
    int k =  scn.nextInt();

    rotate(a, k);
    display(a);
 }

}
