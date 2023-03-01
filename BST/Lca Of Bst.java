 public static int lca(Node node, int d1, int d2) {
    // write your code here
    if(node==null)
    {
        return -1;
    }
    if(node.data==d1)
    {
        flag1=true;
        return d1;
    }
    else if(node.data==d2)
    {
        flag2=true;
        return d2;
    }
   
    int lf=lca(node.left,d1,d2);
    int rt=lca(node.right,d1,d2);
    if(lf==-1 && rt==-1)
    {
        return -1;
    }
    else if(lf==-1 )
    {
        return rt;
    }
    else if(rt==-1)
    {
        return lf;
    }
    else
    {
        return node.data;
    }
  }
