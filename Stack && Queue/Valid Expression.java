class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else if(st.size()>0)
            {
                if(ch==')')
                {
                    if(st.peek()=='(')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(ch=='}')
                {
                    if(st.peek()=='{')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(ch==']')
                {
                    if(st.peek()=='[')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
                else
                {
                    return false;
                }
        }
        if(st.size()>0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
} 
