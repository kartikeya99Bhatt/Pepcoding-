import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      String str=scn.next();
      ArrayList<String>ans=gss(str);
      System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0)
        {
            ArrayList<String>base=new ArrayList<>();
            base.add("");
            return base;
        }
        char ch=str.charAt(0);
        String rstr=str.substring(1);
        ArrayList<String>get=gss(rstr);
        ArrayList<String>myans=new ArrayList<>();
        for(String val:get)
         myans.add(val);
         
        for(String val:get)
         myans.add(ch+val);
         
         return myans;
    }

}
