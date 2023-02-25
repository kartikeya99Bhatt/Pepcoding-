 public static void mirror(Node node){
    // write your code here
    for(Node temp:node.children)
    {
        mirror(temp);
    }
    Collections.reverse(node.children);
  }
