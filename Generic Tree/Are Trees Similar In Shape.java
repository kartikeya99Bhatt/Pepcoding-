 public static boolean areSimilar(Node n1, Node n2) {
    // write your code here
    if(n1.children.size()!=n2.children.size())
    {
        return false;
    }
    for(int i=0;i<n1.children.size();i++)
    {
        Node temp1=n1.children.get(i);
        Node temp2=n2.children.get(i);
        boolean getval=areSimilar(temp1,temp2);
        if(getval==false)
        return false;
    }
    return true;
  }
