public static int size(Node node) {
    // write your code here
    if(node==null)
    {
        return 0;
    }
    int lz=size(node.left);
    int rz=size(node.right);
    return (lz+rz+1);
  }

  public static int sum(Node node) {
    // write your code here
    if(node==null)
     return 0;
     
    int ls=sum(node.left);
    int rs=sum(node.right);
    return(ls+rs+node.data);
  }

  public static int max(Node node) {
    // write your code here
    if(node==null)
    {
        return 0;
    }
    int lx=max(node.left);
    int rx=max(node.right);
    return ( Math.max(node.data,Math.max(lx,rx)) );
  }

  public static int height(Node node) {
    // write your code here
    if(node==null) 
     return -1;
    int lf=height(node.left);
    int rt=height(node.right);
    return (Math.max(lf,rt)+1);
  }
