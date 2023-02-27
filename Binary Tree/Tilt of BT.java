static int tilt = 0;
  public static int tilt(Node node){
    // write your code here to set the tilt data member
    if(node==null)return 0;
    
    int left=tilt(node.left);
    int right=tilt(node.right);
    tilt=tilt+Math.abs(left-right);
    return (left+right+node.data); 
  }
