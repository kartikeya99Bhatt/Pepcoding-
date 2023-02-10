import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		// write your code here
		char pre=' ';
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(i==0)
		    {
		        pre=ch;
		        sb.append(ch);
		    }
		    else 
		    {
		        if(ch!=pre)
		        {
		             pre=ch;
		           sb.append(ch);
		        }
		    }
		}

		return sb.toString();
	}

	public static String compression2(String str){
		// write your code here
			char pre=' ';
		StringBuilder sb=new StringBuilder("");
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(i==0)
		    {
		        pre=ch;
		        cnt=1;
		    }
		    else 
		    {
		        if(ch!=pre)
		        {
		            sb.append(pre);
		            if(cnt!=1)
		            sb.append(cnt);
		             pre=ch;
		             cnt=1;
		        }
		        else
		        cnt++;
		    }
		}
		sb.append(pre);
		 if(cnt!=1)
		sb.append(cnt);

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
