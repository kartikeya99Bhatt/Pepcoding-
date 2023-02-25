 static int nms=0;
   static int total=Integer.MIN_VALUE;
  public static int  getMaxSumSubtree(Node node)
  {
      int sum=node.data;
      for(Node child:node.children)
      {
           sum+=getMaxSumSubtree(child);
      }
      if(sum>total)
      {
          total=sum;
          nms=node.data;
      }
      return sum;
  }
