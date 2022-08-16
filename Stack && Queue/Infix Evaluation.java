import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    // code
    Stack<Integer>value=new Stack<>();
    Stack<Character>st=new Stack<>();
    for(int i=0;i<exp.length();i++)
    {
        char ch=exp.charAt(i);
        if(ch==' ')
        continue;
        else if(ch=='(') 
        {
            st.push(ch);
        }
        else if(ch==')')
        {
            while(st.peek()!='(')
            {
                int v1=value.pop();
                int v2=value.pop();
                char op=st.pop();
                value.push(evaluation(v2,v1,op));
            }
            st.pop();
        }
        else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
        {
            if(st.size()>0 && st.peek()!='(' && preference(st.peek())>=preference(ch))
            {
                int v1=value.pop();
                int v2=value.pop();
                char op=st.pop();
                value.push(evaluation(v2,v1,op));
            }
            st.push(ch);
        }
        else
        {
            value.push(Integer.parseInt(""+ch));
        }
    }
          while(st.size()>0)
            {
                int v1=value.pop();
                int v2=value.pop();
                char op=st.pop();
                value.push(evaluation(v2,v1,op));
            }
   System.out.println(value.pop());
 }
 public static int preference(char ch)
 {
     if(ch=='/'||ch=='*') return 2;
     if(ch=='+'||ch=='-') return 1;
     else return 0;
 }
 public static int evaluation(int v1,int v2,char op)
 {
     if(op=='+') return(v1+v2);
     else if(op=='-') return(v1-v2);
     else if(op=='*') return (v1*v2);
     else if(op=='/') return (v1/v2);
     return 0;
 
}


}
