import java.io.*;
import java.util.*;
public class Main{
public static void main (String []args)
{
 Scanner scn=new Scanner(System.in);
 int n=scn.nextInt();
 int [][]a=new int [n][n];
 for(int i=0;i<a.length;i++)
 {
     for(int j=0;j<a[0].length;j++)
     {
         a[i][j]=scn.nextInt();
     }
 }
 
 //LOGIC OF SADDLE POINT 
  for(int i=0;i<a.length;i++)
  {
      int min=a[i][0];
      int ci=0;
      for(int j=1;j<a.length;j++)
      {
          if(a[i][j]<min)
          {
              min=a[i][j];
              ci=j;
          }
      }
      
      int temp=a[i][ci];
      int max=a[0][ci];
      for(int j=1;j<a.length;j++)
      {
          if(a[j][ci]>max)
          {
              max=a[j][ci];
          }
      }
      if(max==temp)
      {
          System.out.println(max);
          return ;
      }
      
  }
  
          System.out.println("Invalid input" );
}
}
