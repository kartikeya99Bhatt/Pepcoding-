static void quickSort(int arr[], int lo, int hi)
    {
        // code here
        if(lo>=hi)
        {
            return ;
        }
       
        int pIdx=partition(arr,lo,hi);
        quickSort(arr,lo,pIdx-1);
        quickSort(arr,pIdx+1,hi);
    }
    static int partition(int arr[], int lo, int hi)
    {
        // your code here
        int i = lo, j = lo;int pivot=arr[hi];
        while (i <= hi) {
          if (arr[i] <= pivot) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j++;
          } else {
            i++;
          }
        }
        return (j - 1);
    } 
