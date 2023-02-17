 public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int n=a.length;
    int m=b.length;
    
    int []c=new int[n+m];
    int i=0;int j=0;
    int k=0;
    
    while(i<n && j<m)
    {
        if(a[i]<b[j])
        {
           c[k]=a[i];
           k++;i++;
        }
        else
        {
            c[k]=b[j];
            k++;j++;
        }
    }
    
    while(i<n)
    {
       c[k]=a[i];
       k++;i++;
    }
    while(j<m)
    {
       c[k]=b[j];
       k++;j++; 
    }
    
    return c;
  }
