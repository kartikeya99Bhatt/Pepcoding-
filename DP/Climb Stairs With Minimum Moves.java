 public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=scn.nextInt();
        Integer []dp=new Integer[n+1];
        cswmm(arr,dp,n);
    }
    public static void cswmm(int []arr,Integer []dp,int n)
    {
        dp[n]=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=arr[i];j++)
            {
                if(i+j<=n && dp[i + j] != null)
                {
                    min=Math.min(min,dp[i+j]);
                }
            }
             if(min != Integer.MAX_VALUE){
              dp[i]=min+1;
             }
        }
        
        System.out.println(dp[0]);
    }
