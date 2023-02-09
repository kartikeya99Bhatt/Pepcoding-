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
        int dir=0;int i=0;int j=0;
          while(true)
          {
                dir=(dir+a[i][j])%4;
                
                if(dir==0)
                {
                    j++;
                    if(j==m)
                    {
                        j--;
                        break;
                    }
                }
                else if(dir==1)
                {
                    i++;
                    if(i==n)
                    {
                        i--;
                        break;
                    }
                }
                else if(dir==2)
                {
                    j--;
                    if(j==-1)
                    {
                        j++;
                        break;
                    }
                }
                else if(dir==3)
                {
                    i--;
                    if(i==-1)
                    {
                        i++;
                        break;
                    }
                }
            }
            System.out.println(i);
            System.out.println(j);
        
    }

}
