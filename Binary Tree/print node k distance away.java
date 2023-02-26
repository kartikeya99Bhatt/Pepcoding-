public static ArrayList<Node> nodeToRootPath(Node node,int data)
 {
     if(node==null)
     {
         return (new ArrayList<>());
     }
     if(node.data==data)
     {
         ArrayList<Node>base=new ArrayList<>();
         base.add(node);
         return base;
     }
     ArrayList<Node>a=nodeToRootPath(node.left,data);
     if(a.size()>0)
     {
         a.add(node);
         return a;
     }
     ArrayList<Node>b=nodeToRootPath(node.right,data);
     if(b.size()>0)
     {
         b.add(node);
         return b;
     }
     
     return (new ArrayList<>());
 }

  public static void printKNodesFar(Node node, int data, int k) {
    // write your code here
    ArrayList<Node>list=nodeToRootPath(node,data);
    Node block=null;
    for(int i=0;i<list.size();i++)
    {
        block=(i-1)<0?null:list.get(i-1);
        printKdistance(list.get(i),k-i,0,block);
        
    }
  }
  public static void printKdistance(Node node,int k,int ck,Node block)
  {
      if(node==null || node==block)
      {
          return ;
      }
      if(k==ck)
      {
          System.out.println(node.data);
          return ;
      }
      printKdistance(node.left,k,ck+1,block);
      printKdistance(node.right,k,ck+1,block);
  }
