import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn=new Scanner(System.in);
       String str=scn.next();
       printKPC(str,"");
    }
   static String []expand={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
   
   
    public static void printKPC(String str, String asf) {
        if(str.length()==0)
        {
            System.out.println(asf);
            return ;
        }
        char ch=str.charAt(0);
        String rstr=str.substring(1);
        String getStr=expand[ch-'0'];
        for(int i=0;i<getStr.length();i++)
        {
            printKPC(rstr,asf+getStr.charAt(i));
        }
    }

}
