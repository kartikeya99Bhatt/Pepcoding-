class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer>st=new Stack<>();
    	for(int i=0;i<n;i++)
    	{
    	    st.push(i);
    	}
    	while(st.size()>1)
    	{
    	    int i=st.pop();
    	    int j=st.pop();
    	    
    	    // i can be celibrity
    	    if(M[i][j]==0 && M[j][i]==1)
    	    {
    	        st.push(i);
    	    }
    	    else // j can be celibrity
    	    {
    	        st.push(j);
    	    }
    	}
    	int possibleAns=st.pop();
      for(int j=0;j<n;j++)
      {
          if(M[possibleAns][j]!=0)
          {
            return -1    ;
          }
      }
      for(int i=0;i<n;i++)
      {
          if(i!=possibleAns && M[i][possibleAns]!=1)
          {
            return -1  ;  
         }
      } 
      return possibleAns;
    }
}
