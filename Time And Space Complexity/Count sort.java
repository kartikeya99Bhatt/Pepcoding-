  public static void countSort(int[] arr) {
   //write your code here
   int max=Integer.MIN_VALUE;
   int min=Integer.MAX_VALUE;
   
   for(int val:arr){
       max=Math.max(max,val);
       min=Math.min(min,val);
   }
    int range=max-min+1;
    int []psa=new int[range];
    for(int val:arr)
    {
        psa[val-min]++;
    }
    for(int i=1;i<range;i++)
    {
        psa[i]+=psa[i-1];
    }
    int n =arr.length;
    int []ans=new int[n];
    for(int i=n-1;i>=0;i--)
    {
        int val=arr[i];
        psa[val-min]--;
        ans[psa[val-min]]=val;
    }
    print(ans);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
