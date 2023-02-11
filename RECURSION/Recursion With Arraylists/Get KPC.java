import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scn=new Scanner(System.in);
      String str=scn.next();
      ArrayList<String>ans=getKPC(str);
      System.out.println(ans);
    }
    static String []expand={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
       if(str.length()==0)
       {
           ArrayList<String>base=new ArrayList<>();
           base.add("");
           return base;
       }
       char ch=str.charAt(0);
       String rstr=str.substring(1);
       ArrayList<String>get=getKPC(rstr);
       String expended=expand[ch-'0'];
       ArrayList<String>myans=new ArrayList<>();
       for(int i=0;i<expended.length();i++)
       {
           for(String val:get)
           {
               myans.add(expended.charAt(i)+val);
           }
       }
       return myans;
    }

}
