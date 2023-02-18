public static void targetSumPair(int[] arr, int target){
    //write your code here
    Arrays.sort(arr);
    int i=0;
    int j=arr.length-1;
    while(i<j)
    {
        int sum=arr[i]+arr[j];
        if(sum==target)
        {
            System.out.println(arr[i]+", "+arr[j]);
            i++;
        }
        else if(sum>target)
        {
            j--;
        }
        else
        {
            i++;
        }
    }

  }
