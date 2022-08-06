
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long []ans=new long[n];
        Stack<Long>st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--)
        {
            while(st.size()>0 && arr[i]>st.peek())
            {
                st.pop();
            }
            if(st.size()==0)
            {
                ans[i]=-1l;
                st.push(arr[i]);
            }
            else
            {
                ans[i]=st.peek();
                st.push(arr[i]);
            }
        }
        return ans ;
    } 
}
