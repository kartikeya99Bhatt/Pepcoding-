class Solution 
{ 
    boolean valid(String s) 
    { 
        // code here
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='('||ch=='{'||ch=='[')
            {
                st.push(ch);
            }
            else 
            {
                 if(st.size()>0 && ch=='}' && st.peek()=='{')
                {
                    st.pop();
                }
                else if(st.size()>0 && ch==']' && st.peek()=='[')
                {
                    st.pop();
                }
                else if(st.size()>0 && ch==')' && st.peek()=='(')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
        }
       return(st.size()==0?true:false);
    }
} 
