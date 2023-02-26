 public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    if(node==null)
    {
         return (new ArrayList<>());
    }
    if(node.data==data)
    {
        ArrayList<Integer>base=new ArrayList<>();
        base.add(node.data);
        return base;
    }
    ArrayList<Integer>lf= nodeToRootPath(node.left, data);
    if(lf.size()>0)
    {
        lf.add(node.data);
        return lf;
    }
    ArrayList<Integer>rt=nodeToRootPath(node.right, data);
    if(rt.size()>0)
    {
        rt.add(node.data);
        return rt;
    }
    return (new ArrayList<>());
  }
