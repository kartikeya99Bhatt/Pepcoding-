// two queue approch 


  public static void levelOrder1(Node node) {
    // write your code here
    Queue<Node>mq=new ArrayDeque<>();
    Queue<Node>cq=new ArrayDeque<>();
    mq.add(node);
    while(mq.size()>0)
    {
        Node temp=mq.remove();
        System.out.print(temp.data+" ");
        if(temp.left!=null)
        cq.add(temp.left);
        if(temp.right!=null)
        cq.add(temp.right);
        if(mq.size()==0)
        {
            mq=cq;
            cq=new ArrayDeque<>();
            System.out.println();
        }
    }
  }
  // count approch 


  public static void levalOrder2(Node node)
  {
     Queue<Node>q=new ArrayDeque<>();
     q.add(node);
     while(q.size()>0)
     {
         int sz=q.size();
         while(sz-->0)
         {
            Node temp=q.remove();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
            q.add(temp.left);
            if(temp.right!=null)
            q.add(temp.right);
         }
         System.out.println();
     }
  }
  //delimiter approch


  public static void levalOrder3(Node node)
  {
      Queue<Node>q=new ArrayDeque<>();
      q.add(node);
      q.add(new Node(-1,null,null));
      while(q.size()>0)
      {
          Node temp=q.remove();
          if(temp.data==-1)
          {
            q.add(new Node(-1,null,null));
            System.out.println();
            continue;
          }
          System.out.print(temp.data+" ");
          if(temp.left!=null)
          q.add(temp.left);
          if(temp.right!=null)
          q.add(temp.right);
      }
  }
