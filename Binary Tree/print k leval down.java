public static void solve(Node node,int k,int ck)
  {
      if(node==null)
      {
          return ;
      }
      if(ck==k)
      {
          System.out.println(node.data);
          return ;
      }
      solve(node.left,k,ck+1);
      solve(node.right,k,ck+1);
  }
