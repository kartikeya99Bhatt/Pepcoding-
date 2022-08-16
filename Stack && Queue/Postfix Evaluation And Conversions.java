import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer>value=new Stack<>();
    Stack<String>infix=new Stack<>();
    Stack<String>prefix=new Stack<>();
    
    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
            int v1=value.pop();
            int v2=value.pop();
            
            value.push(evaluate(v2,v1,ch));
            
            String u1=infix.pop();
            String u2=infix.pop();
            infix.push("("+u2+ch+u1+")");
            
            
            String y1=prefix.pop();
            String y2=prefix.pop();
            prefix.push(ch+y2+y1);
            
        }
        else 
        {
            value.push(Integer.parseInt(ch+""));
            infix.push(ch+"");
            prefix.push(ch+"");
        }
    }
    System.out.println(value.pop());
    System.out.println(infix.pop());
    System.out.println(prefix.pop());
    
 }
 public static int evaluate(int v1,int v2,char ch)
 {
     if(ch=='+') return(v1+v2);
     if(ch=='*') return(v1*v2);
     if(ch=='/') return(v1/v2);
     if(ch=='-') return(v1-v2);
     
     return 0;
 }
}
