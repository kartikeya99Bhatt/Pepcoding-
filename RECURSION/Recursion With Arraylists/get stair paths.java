import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         ArrayList<String>ans=getStairPaths(n);
         System.out.println(ans);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n<0)
        {
            ArrayList<String>base=new ArrayList<>();
            return base;
        }
      else if(n==0)
      {
          ArrayList<String>base=new ArrayList<>();
          base.add("");
          return base;
      }
      ArrayList<String>path1=getStairPaths(n-1);
      ArrayList<String>path2=getStairPaths(n-2);
      ArrayList<String>path3=getStairPaths(n-3);
      
      ArrayList<String>myans=new ArrayList<>();
       for(String ans:path1)
        {
            myans.add('1'+ans);
        }
        for(String ans:path2)
        {
            myans.add('2'+ans);
        }
        for(String ans:path3)
        {
            myans.add('3'+ans);
        }
      return myans;
    }

}
