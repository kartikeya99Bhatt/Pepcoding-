public static Node add(Node node, int data) {
    // write your code here
    if(node==null)
    {
        Node base=new Node(data,null,null);
        return base;
    }
    if(node.data>data)
    {
        node.left=add(node.left,data);
    }
    else if(node.data<data)
    {
        node.right=add(node.right,data);
    }
    return node;
  }
