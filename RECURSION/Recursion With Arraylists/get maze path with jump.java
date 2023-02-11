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
       //horizontal step
       for(int sp=1;sp+sc<=dc;sp++)
       {
           ArrayList<String>path1=getMazePaths(sr,sc+sp,dr,dc);
           for(String val:path1)
           {
               myans.add("h"+sp+val);
           }
       }
       
       //vertical step
       for(int sp=1;sp+sr<=dr;sp++)
       {
           ArrayList<String>path1=getMazePaths(sr+sp,sc,dr,dc);
            for(String val:path1)
           {
               myans.add("v"+sp+val);
           }
       }
       
       //digonal step
       for(int sp=1;sp+sr<=dr && sp+sc<=dc;sp++)
       {
           ArrayList<String>path1=getMazePaths(sr+sp,sc+sp,dr,dc);
            for(String val:path1)
           {
               myans.add("d"+sp+val);
           }
       }
       return myans;
       
    }

}
