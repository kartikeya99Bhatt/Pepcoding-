  static boolean ans=true;
  public static int isTreeBalance(Node node)
  {
      if(ans==false)
      {
          return 0;
      }
      if(node==null)
      {
          return 0;
      }
       int lf=isTreeBalance(node.left);
       int rt=isTreeBalance(node.right);
       int diff=Math.abs(lf-rt);
       if(diff>1)
       {
           ans=false;
           return 0;
       }
       return (Math.max(lf,rt)+1);
  }
