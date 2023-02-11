import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int m=scn.nextInt();
      ArrayList<String>ans=getMazePaths(1,1,n,m);
      System.out.println(ans);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
      if(sr==dr && sc==dc)
      {
          ArrayList<String>base=new ArrayList<>();
          base.add("");
          return base;
      }
      ArrayList<String>myans=new ArrayList<>();
       if(sr<dr)
      {
        ArrayList<String>path1=getMazePaths(sr+1,sc,dr,dc); 
        for(String val:path1)
        {
            myans.add('h'+val);
        }
      }
      if(sc<dc)
      {
         ArrayList<String>path2=getMazePaths(sr,sc+1,dr,dc);
          for(String val:path2)
        {
            myans.add('v'+val);
        }
      }
      
     
      
      return myans;
    }

}
