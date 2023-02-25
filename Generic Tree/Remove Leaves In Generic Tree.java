 public static void removeLeaves(Node node) {
    // write your code here
    for(int i=node.children.size()-1;i>=0;i--)
    {
        Node temp=node.children.get(i);
        if(temp.children.size()==0)
        {
            node.children.remove(i);
            
        }
    }
    for(Node child:node.children)
    {
        removeLeaves(child);
    }
    
  }
