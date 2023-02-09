import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner (System.in);
        int n=scn.nextInt();
        int [][]a=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=scn.nextInt();
            }
        }
        Transpose(a);
        adjustColumn(a);
        display(a);
    }
    public static void adjustColumn(int [][]a)
    {
        int i=0;int j=a.length-1;
        while(i<j)
        {
            for(int k=0;k<a.length;k++)
            {
                int temp=a[k][i];
                a[k][i]=a[k][j];
                a[k][j]=temp;
            }
            i++;
            j--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void Transpose(int [][]a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
    }

}
