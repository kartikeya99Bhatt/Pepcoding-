import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int [][]a=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=scn.nextInt();
            }
        }
        int sr=0;int sc=0;
        int er=n-1;
        int ec=m-1;
        int total=n*m;
        int cnt=0   ;
        while(cnt<total)
        {
            
            for(int i=sr;i<=er&&cnt<total;i++){
                System.out.println(a[i][sc]);
                cnt++;
            }
            sc++;
            for(int i=sc;i<=ec&&cnt<total;i++){
                System.out.println(a[er][i]);
                cnt ++;
            }
            er--;
            for(int i=er;i>=sr&&cnt<total;i--){
               System.out.println(a[i][ec]);
               cnt ++;
            }
            ec--;
            for(int i=ec;i>=sc&&cnt<total;i--){
                System.out.println(a[sr][i]);
                cnt ++;
            }
            sr++;
            
        }
    }

}
