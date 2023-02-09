import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int [][] a=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              a[i][j]=scn.nextInt();
            }
        }
        for(int g=0;g<n;g++)
        {
            for(int r=0,c=g;c<n;r++,c++)
            {
                System.out.println(a[r][c]);
            }
        }
        
        
    }

}
