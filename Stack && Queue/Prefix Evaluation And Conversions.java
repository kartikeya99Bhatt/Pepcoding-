import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer>value=new Stack<>();
    Stack<String>infix=new Stack<>();
    Stack<String>postfix=new Stack<>();
    
    for(int i=exp.length()-1;i>=0;i--)
    {
        char ch=exp.charAt(i);
        
        if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
            int v1=value.pop();
            int v2=value.pop();
            
            value.push(evaluate(v1,v2,ch));
            
            String u1=infix.pop();
            String u2=infix.pop();
            
            infix.push("("+u1+ch+u2+")");
            
            String y1=postfix.pop();
            String y2=postfix.pop();
            
            postfix.push(y1+y2+ch);
        }
        else
        {
            value.push(Integer.parseInt(ch+""));
            infix.push(ch+"");
            postfix.push(ch+"");
        }
    }
    System.out.println(value.pop());
    System.out.println(infix.pop());
    System.out.println(postfix.pop());
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
