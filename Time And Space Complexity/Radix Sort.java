  public static void radixSort(int[] arr) {
    // write code here    
    int max=Integer.MIN_VALUE;
    for(int val:arr){
        max=Math.max(max,val);
    }
    int place=1;
    while(max/place>0)
    {
        countSort(arr,place);
        place*=10;
    }
    
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    int []ans=new int[arr.length];
    int []fq=new int[10];
    
    for(int val:arr){
       fq[(val/exp)%10]++;
    }
   
    for(int i=1;i<fq.length;i++){
        fq[i]+=fq[i-1];
    }
    for(int i=arr.length-1;i>=0;i--)
    {
        int val=arr[i];
        fq[(val/exp)%10]--;
        ans[fq[(val/exp)%10]]=val;
    }
    for(int i=0;i<arr.length;i++){
        arr[i]=ans[i];
    }
    System.out.print("After sorting on "+exp+" place -> "); 
    print(arr);
  }
