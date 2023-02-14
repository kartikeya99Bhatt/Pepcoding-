// RECURSION
// n =givin
// st=0;
// arr given
public static int climbStair(int n,int st,int []arr)
    {
        if(n==st)
        {
            return 1;
        }
        int val=0;
       for(int sp=1;sp<=arr[st];sp++)
       {
           if(st+sp<=n)
           {
               val+= climbStair(n,st+sp,arr);
           }
           else
           {
               return 0;
           }
       }
       return val;
    }

// MEMOIZATION

 public static int climbStair(int n,int st,int []dp,int []arr)
    {
        if(n==st)
        {
            return 1;
        }
        else if(dp[st]!=0)
        {
            return dp[st];
        }
        int val=0;
       for(int sp=1;sp<=arr[st];sp++)
       {
           if(st+sp<=n)
           {
               val+= climbStair(n,st+sp,dp,arr);
           }
           else
           {
               return val;
           }
       }
       
       dp[st]=val;
       return dp[st];
    }



// TABULATION

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int []arr=new int[n];
        int []dp=new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        climbStairs(arr,dp);
        System.out.println(dp[0]);
    }
    public static void climbStairs(int []arr,int []dp)
    {
        dp[arr.length]=1;
        for(int i=arr.length-1;i>=0;i--)
        {
            for(int j=1;j<=arr[i];j++)
            {
                if(i+j<=arr.length)
                {
                    dp[i]+=dp[i+j];
                }
                else
                {
                    break;
                }
            }
        }
    }
