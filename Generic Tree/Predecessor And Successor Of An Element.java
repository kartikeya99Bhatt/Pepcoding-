 static Node predecessor;
  static Node successor;
  static boolean flag;
  public static boolean predecessorAndSuccessor(Node node, int data) {
    // write your code here
    if(node.data==data)
    {
        flag=true;
    }
    else if(flag==false)
    {
        predecessor=node;
    }
    else if(flag==true)
    {
        successor=node;
        return true;
    }
    for(Node child:node.children)
    {
        boolean getval=predecessorAndSuccessor(child,data);
        if(getval==true)
        {
            return true;
        }
    }
    return false;
  }
