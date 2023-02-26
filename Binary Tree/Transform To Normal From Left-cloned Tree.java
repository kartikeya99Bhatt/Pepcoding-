 public static Node transBackFromLeftClonedTree(Node node){
    // write your code here
    if(node==null)
    {
        return null;
    }
    Node lf=transBackFromLeftClonedTree(node.left.left);
    Node rt=transBackFromLeftClonedTree(node.right);
    node.left=lf;
   return node;
  }
