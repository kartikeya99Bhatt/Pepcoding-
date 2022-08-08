class Solution {
    
     int constant=0;
    
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []ans=new int[nums.length-k+1];
        constant=nums.length;
      
        int []nge=new int[nums.length];
        setNextGreaterElement(nums,nge);
        for(int val:nge){System.out.print(val+",");}
        findMaxInKthSize(ans,nge,k,nums);
        return ans;
    }
    public void setNextGreaterElement(int []nums,int []nge){
        Stack<Integer>st=new Stack<>();
       for(int i=nums.length-1;i>=0;i--)
       {
           while(st.size()>0 && nums[st.peek()]<nums[i])
           {
               st.pop();
           }
           if(st.size()==0)
           {
               nge[i]=constant;
               st.push(i);
           }
           else
           {
               nge[i]=st.peek();
               st.push(i);
           }
       }
    }
    public void findMaxInKthSize(int []ans,int []nge,int k,int []nums)
    {
        int j=0;
        for(int i=0;i<ans.length;i++)
        {
            int windowSize=i+k-1;
            if(j<i){
                j=i;
            }
            while(nge[j]<=windowSize)
            {
               j=nge[j];   
            }
            ans[i]=nums[j];
        }
    }
}
