  public static int size(Node node) {
      if(node==null)
      {
          return 0;
      }
    // write your code here
    int lf=size(node.left);
    int rt=size(node.right);
    
    return (lf+rt+1);
  }

  public static int sum(Node node) {
      if(node==null)
      return 0;
    // write your code here
    int lf=sum(node.left);
    int rt=sum(node.right);
    return (lf+rt+node.data);
  }

  public static int max(Node node) {
    // write your code here
    if(node==null)
    {
        return Integer.MIN_VALUE;
    }
    
    int lf=max(node.left);
    int rt=max(node.right);
    
    return Math.max(node.data,Math.max(lf,rt));
  }

  public static int min(Node node) {
    // write your code here
     if(node==null)
    {
        return Integer.MAX_VALUE;
    }
    
    int lf=min(node.left);
    int rt=min(node.right);
    
    return Math.min(node.data,Math.min(lf,rt));
  }
