
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
