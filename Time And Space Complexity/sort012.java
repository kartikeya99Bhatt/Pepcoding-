 public static void sort012(int[] arr){
    //write your code here
    int j=0;int k=arr.length-1;
    
    for(int i=0;i<arr.length && i<=k;i++)
    {
        if(arr[i]==0)
        {
            swap(arr,i,j);
            j++;
        }
        else if(arr[i]==2)
        {
            swap(arr,i,k);
            k--;
            i--;
        }
    }
  }
