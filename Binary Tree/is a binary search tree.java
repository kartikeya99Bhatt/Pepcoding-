public static class pair
{
    int max=Integer.MIN_VALUE;// max  value from left
    int min=Integer.MAX_VALUE; //min value from right
}
 static boolean ans=true;
  public static pair IsABinarySearchTree(Node node)
  {
      if(node==null)
      {
          pair base=new pair();
          return base;
      }
      if(ans==false)
      {
          return new pair();
      }
      pair left=IsABinarySearchTree(node.left);
      pair right=IsABinarySearchTree(node.right);
      
      if(node.data<left.max || node.data>right.min )
      {
          ans=false;
          return new pair();
      }
      pair temp=new pair();
      temp.max=Math.max(node.data,Math.max(right.max,left.max));
      temp.min=Math.min(node.data,Math.min(left.min,right.min));
      return temp;
  }
