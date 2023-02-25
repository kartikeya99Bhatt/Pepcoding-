  public static boolean IsSymmetric(Node node) {
    // write your code here
    return (IsMirror(node,node));
  }
  public static boolean IsMirror(Node node,Node node2)
  {
      if(node.children.size()!=node2.children.size())
      {
          return false;
      }
     for(int i=0;i<node.children.size();i++)
     {
         Node temp1=node.children.get(i);
         Node temp2=node.children.get(node.children.size()-1-i);
         boolean getval=IsMirror(temp1,temp2);
         if(getval==false)
         {
             return false;
         }
     }
     return true ;
  }
