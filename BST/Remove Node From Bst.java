 public static Node remove(Node node, int data) {
    // write your code here
    if(node.data==data)
    {
        if(node.left==null && node.right==null)
        {
            return null;
        }
        else if(node.left!=null && node.right!=null)
        {
            int newdata=getLeftMax(node.left);
            node.data=newdata;
            node.left=remove(node.left,node.data);
            return node;
        }
        else if(node.left==null)
        {
            return (node.right);
        }
        else if(node.right==null)
        {
            return (node.left);
        }
    }
    
    if(node.data>data)
    {
        node.left=remove(node.left,data);
    }
    else if(node.data<data)
    {
        node.right=remove(node.right,data);
    }
     return node;
  }
