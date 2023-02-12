import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [][]arr=new int[n][n];
        printNQueens(arr,"",0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row==chess.length)
        {
           System.out.println(qsf+".");
        }
        for(int i=0;i<chess[0].length;i++)
        {
            if(IsItSafe(chess,row,i))
            {
                chess[row][i]=1;
                printNQueens(chess,qsf+row+"-"+i+", ",row+1);
                chess[row][i]=0;
            }
        }
    }
    public static boolean IsItSafe(int [][]chess,int row,int col)
   {
       // Digonal one
       for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
       {
           if(chess[i][j]==1)
           {
              return false; 
           }
       }
       // digonal two
       for(int i=row-1,j=col+1;i>=0 && j<chess.length;i--,j++)
       {
           if(chess[i][j]==1)
           {
               return false;
           }
              
       }
       // Straight up
       for(int i=row-1;i>=0;i--)
       {
           if(chess[i][col]==1)
           {
               return false;
           }
       }
       return true;
   }
}
