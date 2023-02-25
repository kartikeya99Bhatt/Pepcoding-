public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
   if(node.data==data)
   {
       ArrayList<Integer>base=new ArrayList<>();
       base.add(data);
       return base;
   }
   for(Node child:node.children)
   {
       ArrayList<Integer>getval=nodeToRootPath(child,data);
       if(getval.size()>0)
       {
          
           getval.add(node.data);
           return getval;
           
       }
      
   }
   return (new ArrayList<>());
   
 }
