public static void sortDates(int[] arr) {
    // write your code here
    countSort(arr,1000000,100,32);
    countSort(arr,10000,100,13);
    countSort(arr,1,10000,2501);
  }

  public static void countSort(int[] arr,int div, int mod, int range) {
    // write your code here
    int []ans=new int[arr.length];
    int []fq=new int[range];
    for(int val:arr)
    {
        fq[val/div%mod]++;
    }
    for(int i=1;i<fq.length;i++){
        fq[i]+=fq[i-1];
    }
    for(int i=arr.length-1;i>=0;i--)
    {
        int val=arr[i];
        fq[val/div%mod]--;
        ans[fq[val/div%mod]]=val;
    }
    for(int i=0;i<ans.length;i++)
    {
        arr[i]=ans[i];
    }
  }
