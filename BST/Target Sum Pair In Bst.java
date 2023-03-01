 public static void TargetSumPair(Node node,Node root,int target){
      if(node==null)
      {
          return ;
      }
      TargetSumPair(node.left,root,target);
     
      if(node.data<target-node.data && find(root,target-node.data)==true)
      {
          System.out.println(node.data+" "+(target-node.data));
      }
      TargetSumPair(node.right,root,target);
  }
  public static boolean  find(Node node,int data){
      if(node==null) return false;
      if(node.data==data) return true;
      boolean lf=find(node.left,data);
      if(lf==true)return true;
      boolean rt=find(node.right,data); 
      if(rt==true) return true;
      
      return false;
  }
