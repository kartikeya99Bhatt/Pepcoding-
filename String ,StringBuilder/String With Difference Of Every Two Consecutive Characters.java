import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		// write your code here
		StringBuilder sb=new StringBuilder("");
        char pre=' ';
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(i==0)
            {
                pre=ch;
            }
            else
            {
                int diff=(int)(ch-pre);
                sb.append(pre);
                sb.append(diff);
                pre=ch;
            }
        }
        sb.append(pre);
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
