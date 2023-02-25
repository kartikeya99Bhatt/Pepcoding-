static int floor1=Integer.MIN_VALUE;
  
  public static void getFloor(Node node,int lar)
  {
      if(node.data>floor1 && node.data<lar)
      {
          floor1=Math.max(floor1,node.data);
      }
      for(Node child:node.children)
      {
          getFloor(child,lar);
      }
  }

  public static int kthLargest(Node node, int k){
    // write your code here
    int Largest=Integer.MAX_VALUE;
    for(int i=0;i<k;i++)
    {
        floor1=Integer.MIN_VALUE;
        getFloor(node,Largest);
        Largest=floor1;
    }
      return Largest;
  }
