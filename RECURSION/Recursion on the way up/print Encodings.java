import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner scn=new Scanner(System.in);
     String str=scn.next();
     printEncodings(str,"");
    }

    public static void printEncodings(String str,String asf) {
        if(str.length()==0)
        {
            System.out.println(asf);
            return ;
        }
        if(str.length()>0)
        {
            char ch=str.charAt(0);
            if(ch=='0') return ;
            String rem=str.substring(1);
            char fch=(char)(Integer.parseInt(""+ch)+'a'-1);
            printEncodings(rem,asf+fch);
        }
        if(str.length()>1)
        {
           String ch=str.substring(0,2);
            if(ch.charAt(0)=='0' || Integer.parseInt(ch)>26) return ;
           String rem=str.substring(2);
           char fch=(char)(Integer.parseInt(ch)+'a'-1);
           printEncodings(rem,asf+fch);
        }
        
    }

}
