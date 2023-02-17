 public static int[] mergeSort(int[] arr, int lo, int hi) {
    //write your code here
    if(lo==hi)
    {
        int []base=new int[1];
        base[0]=arr[lo];
        return base;
    }
    int mid=(lo+hi)/2;
    int []a=mergeSort(arr,lo,mid);
    int []b=mergeSort(arr,mid+1,hi);
    int []c=mergeTwoSortedArrays(a,b);
    return c;
  }
