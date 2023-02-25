 public static boolean find(Node node, int data) {
    // write your code here
     if(node.data==data)
    {
        return true;
    }
    for(Node child:node.children)
    {
        boolean getvl=find(child,data);
        if(getvl==true)
        {
            return true;
        }
    }
   
    return false;
  }
