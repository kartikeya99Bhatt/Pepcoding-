class Solution {
    public String smallestNumber(String pattern) {
        int count=1;
        Stack<Integer>st=new Stack<>();
        StringBuilder ans=new StringBuilder();
        for(char ch:pattern.toCharArray())
        {
            if(ch=='I')
            {
                st.push(count);
                count++;
                while(st.size()>0)
                {
                    ans.append(st.pop());
                }
            }
            else if(ch=='D')
            {
                st.push(count);
                count++;
            }
        }
        st.push(count);
        while(st.size()>0)
        {
            ans.append(st.pop());
        }
        
        return ans.toString();
    }
}
