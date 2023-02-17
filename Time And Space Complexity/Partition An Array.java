public static void partition(int[] arr, int piviot){
    //write your code here
    int i=0;int j=0;int n=arr.length;
    while(i<n)
    {
        if(arr[i]<=piviot)
        {
            swap(arr,i,j);
            i++;j++;
        }
        else
        {
            i++;
        }
    }
    
  }
