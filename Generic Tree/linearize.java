  // This code is O(N^2)
  public static void linearize(Node node)
  {
    for(Node child:node.children)
    {
       linearize(child);
    }
    while(node.children.size()>1)
    {
        Node lastHead=node.children.remove(node.children.size()-1);
        Node sLastHead=node.children.get(node.children.size()-1);
        Node stail=getTail(sLastHead);
        stail.children.add(lastHead);
    }
   
  }
  public static Node getTail(Node node)
  {
      while(node.children.size()>0)
      {
          node=node.children.get(0);
      }
      return (node) ;
  }

// The code is O(N)
 public static Node linearize(Node node){
    // write your code here
    if(node.children.size()==0)
    {
        return node;
    }
    Node lt=linearize(node.children.get(node.children.size()-1));
    while(node.children.size()>1)
    {
        Node last=node.children.remove(node.children.size()-1);
        Node slt=linearize(node.children.get(node.children.size()-1));
        slt.children.add(last);
    }
    return lt;
  }
