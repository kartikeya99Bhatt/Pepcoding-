 public static int quickSelect(int[] arr, int lo, int hi, int k) 
  {
    //write your code here
    int idx=partition(arr,arr[hi],lo,hi);
    
    if(idx==k)
    {
        return arr[idx];
    }
    else if(idx<k)
    {
        return quickSelect(arr,idx+1,hi,k) ;
    }
    else
    {
        return quickSelect(arr,lo,idx-1,k) ;
    }
    
  }
