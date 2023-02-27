public static class pair{
      int max=Integer.MIN_VALUE;
      int min=Integer.MAX_VALUE;
      int sz=0;
  }
  static int bsz=0;
  static int bsn=0;
  public static pair LargestBst(Node node){
      if(node==null)
      {
          return (new pair());
      }
      pair lt=LargestBst(node.left);
      pair rt=LargestBst(node.right);
      
      if(lt.max<node.data && rt.min>node.data)
      {
         if(bsz<lt.sz+rt.sz+1)
         {
            bsz=lt.sz+rt.sz+1;
            bsn=node.data;
         }
      }
      pair temp=new pair();
      temp.max=Math.max(node.data,Math.max(lt.max,rt.max));
      temp.min=Math.min(node.data,Math.max(lt.min,rt.min));
      temp.sz=lt.sz+rt.sz+1;
      return temp;
  }
