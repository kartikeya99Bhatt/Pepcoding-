
  public static boolean  printSingleChildNodes(Node node){
    // write your code here
    if(node==null)
    {
        return false;
    }
    if(node.left==null && node.right==null)
    {
        return true;
    }
    
    boolean lf=printSingleChildNodes(node.left);
    boolean rt=printSingleChildNodes(node.right);
    if(lf==false)
    {
        System.out.println(node.right.data);
    }
    else if(rt==false)
    {
        System.out.println(node.left.data);
    }
    return true ;
  }
