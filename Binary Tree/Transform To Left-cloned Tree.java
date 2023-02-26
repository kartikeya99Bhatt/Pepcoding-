public static Node createLeftCloneTree(Node node){
    // write your code here
    if(node==null)
    {
        return null;
    }
    Node lf=createLeftCloneTree(node.left);
    Node rt=createLeftCloneTree(node.right);
    Node temp=new Node(node.data,null,null);
    temp.left=lf;
    node.left=temp;
    return node;
  }
