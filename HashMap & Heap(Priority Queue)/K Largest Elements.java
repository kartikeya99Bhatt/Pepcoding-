import java.util.*;
 import java.lang.*;
 import java.io.*;
 class Main
  {
 	 public static void main (String[] args) throws IOException
 	  {
 	 	 Scanner scn= new Scanner(System.in);
 	    	 int n = scn.nextInt();
 	 	 int[] num = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 	 num[i] = scn.nextInt();
 	 	 	 }
 	 	 int k = scn.nextInt();
 	 	 solve(n,num,k);
 	  }
 	 
 	  public static void solve(int n,int[] arr,int k){
 	     //Write your code here
          PriorityQueue<Integer>pq=new PriorityQueue<>();
          for(int i=0;i<k;i++)
          {
              pq.add(arr[i]);
          }
          for(int i=k;i<arr.length;i++)
          {
              if(pq.peek()<arr[i])
              {
                  pq.remove(pq.peek());
                  pq.add(arr[i]);
              }
          }
          int []A=new int[k];
          int i=0;
          while(pq.size()>0)
          {
              A[i]=(pq.remove());
              i++;
          }
          for( i=A.length-1;i>=0;i--)
          {
              System.out.print(A[i]+" ");
          }
     }
 }
