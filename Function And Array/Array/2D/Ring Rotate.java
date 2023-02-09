import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]a=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scn.nextInt();
            }
        }
        int s=scn.nextInt();
        int k=scn.nextInt();
        int []arr=fillOneD(a,s);
        
        int len=arr.length;
       
        Reverse(arr,0,arr.length-k-1);
        Reverse(arr,arr.length-k,arr.length-1);
        Reverse(arr,0,arr.length-1); 
        fill2d(a,s,arr);
       
       display(a);
    }
    public static void fill2d(int [][]a,int s,int []arr)
    {
            int row=a.length;
             int col=a[0].length;
           
             int r=s-1;
             int c=s-1;
           
             int mr=row-s;
             int mc=col-s;
           
             int vc=mr-r+1;
             int hr=mc-c+1;
          
            int cnt=0;
             
             
             //down
             for(int i=r;i<=mr;i++)
             {
               a[i][c]=arr[cnt]; 
                cnt++;
             }
             c++;
             //right
             for(int i=c;i<=mc;i++)
             {
                 a[mr][i]=arr[cnt];
                cnt++;
             }
             mr--;
             //up
             for(int i=mr;i>=r;i--)
             {
                 a[i][mc]=arr[cnt];
                 cnt++;
             }
             mc--;
             //left
              
             for(int i=mc;i>=c;i--)
             {
                a[r][i]=arr[cnt];
                cnt++;
             }
             
     
    }
    public static void Reverse(int []a,int i,int j)
    {
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }
 public static int[] fillOneD(int [][]a,int s)
 {
     int row=a.length;
     int col=a[0].length;
   
     int r=s-1;
     int c=s-1;
   
     int mr=row-s;
     int mc=col-s;
   
     int vc=mr-r+1;
     int hr=mc-c+1;
  
     int siz=2*vc+2*hr-4;
     
     int []arr=new int[siz];
     int cnt=0;
   
     //down
     for(int i=r;i<=mr;i++)
     {
        arr[cnt]=a[i][c]; 
        cnt++;
     }
     c++;
     //right
     for(int i=c;i<=mc;i++)
     {
         arr[cnt]=a[mr][i];
        cnt++;
     }
     mr--;
     //up
     for(int i=mr;i>=r;i--)
     {
         arr[cnt]=a[i][mc];
         cnt++;
     }
     mc--;
     //left
      
     for(int i=mc;i>=c;i--)
     {
         arr[cnt]=a[r][i];
        cnt++;
     }
     
     
     
     return arr;
 }
    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
