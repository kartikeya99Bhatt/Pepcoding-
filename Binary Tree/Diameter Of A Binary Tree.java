  static int mdia=0;
  public static int diameter1(Node node) {
    // write your code here
    if(node==null)
    {
        return 0;
    }

    int lft=diameter1(node.left);
    int rt=diameter1(node.right);
    mdia=Math.max(lft+rt,mdia);
    return Math.max(lft,rt)+1;
  }
