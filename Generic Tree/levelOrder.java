
  // APPROCH 1

  public static void levelOrder(Node root){
    // write your code here
    Queue<Node>queue=new ArrayDeque<>();
    queue.add(root);
    while(queue.size()>0)
    {
      Node temp=queue.remove();
      System.out.print(temp.data+" ");
      for(Node child:temp.children)
      {
        queue.add(child);
      }
    }
    System.out.print(".");
  }



// lineWise traversal (USING TWO QUEUE)
  
 public static void levelOrder(Node root)
 {
   Queue<Node>pq=new ArrayDeque<>();
   Queue<Node>cq=new ArrayDeque<>();

   pq.add(root);

   while(pq.size()>0)
   {
     Node temp=pq.remove();
     System.out.print(temp.data+" ");

     for(Node child:temp.children)
     {
       cq.add(child);
     }
     if(pq.size()==0)
     {
       pq=cq;
       cq=new ArrayDeque<>();
       System.out.println();
     }
   }
 }


//ZIG-ZAG Patten 

public static void levelOrderLinewiseZZ(Node node){
    // write your code here
    Stack<Node>ms=new Stack<>();
    Stack<Node>hs=new Stack<>();
    int lv=0;
    ms.push(node);
    
    while(ms.size()>0)
    {
        Node temp=ms.pop();
        System.out.print(temp.data+" ");
        if(lv%2==0)
        {
            for(Node child:temp.children)
            {
                hs.add(child);
            }
        }
        else 
        {
            for(int i=temp.children.size()-1;i>=0;i--)
            {
                 hs.add(temp.children.get(i));
            }
        }
        if(ms.size()==0)
        {
            System.out.println();
            ms=hs;
            hs=new Stack<>();
            lv++;
        }
    }
  }


// APPROCH 3 (LinkedList)

public static void levelOrder(Node root)
{
     LinkedList<Node>queue=new LinkedList<>();
     queue.addLast(root);
   
  while(queue.size()>0)
  {
    Node temp=queue.removeFirst();
    System.out.print(temp.data+" ");

    for(Node child:temp.children)
    {
       queue.addLast(child);
    }
  }
}
