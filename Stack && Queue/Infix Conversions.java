import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<String>prefix=new Stack<>();
    Stack<String>postfix=new Stack<>();
    Stack<Character>operator=new Stack<>();
    
    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);
        
        if(ch=='(')
        {
            operator.push(ch);
        }
        else if(ch==')')
        {
            while(operator.peek()!='(')
            {
                String v1=prefix.pop();
                String v2=prefix.pop();
                char op=operator.pop();
                String s=op+v2+v1;
                 
                prefix.push(s);
                
                v1=postfix.pop();
                v2=postfix.pop();
                 s=v2+v1+op;
                 
                postfix.push(s);
            }
            operator.pop();
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
            while(operator.size()>0 && operator.peek()!='(' && preference(operator.peek()) >= preference(ch))
            {
               String v1=prefix.pop();
                String v2=prefix.pop();
                char op=operator.pop();
                String s=op+v2+v1;
                
                prefix.push(s);
                
                v1=postfix.pop();
                v2=postfix.pop();
                 s=v2+v1+op;
                  
                postfix.push(s);
            }
            operator.push(ch);
        }
        else
        {
            prefix.push(ch+"");
            postfix.push(ch+"");
        }
    }
    while(operator.size()>0)
    {
               String v1=prefix.pop();
                String v2=prefix.pop();
                char op=operator.pop();
                String s=op+v2+v1;
               
                prefix.push(s);
                
                v1=postfix.pop();
                v2=postfix.pop();
                 s=v2+v1+op;
                  
                postfix.push(s);
    }
    
  
       System.out.println(postfix.pop());
       System.out.print(prefix.pop());
   
 }
 public static int preference(char ch)
 {
     if(ch=='/' || ch=='*') return 2;
     if(ch=='+' || ch=='-') return 1;
     return 0;
 }
}
