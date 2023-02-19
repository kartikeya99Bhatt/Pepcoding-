 
     public void oddEven(){
      // write your code here
      Node eHead=null;
      Node eTail=null;
      Node oHead=null;
      Node oTail=null;
      
      Node help=head;
      for(int idx=0;help!=null;idx++)
      {
          Node temp=new Node();
          temp.data=help.data;
          temp.next=null;
         if(help.data%2==0)
         {
             if(eHead==null)
             {
                 eHead=eTail=temp;
             }
             else
             {
                 eTail.next=temp;
                 eTail=eTail.next;
             }
         }
         else
         {
             if(oHead==null)
             {
                 oHead=oTail=temp;
             }
             else
             {
                 oTail.next=temp;
                 oTail=oTail.next;
             }
         }
         help=help.next;
      }
     
      if(oHead==null)
      {
          head=eHead;
          tail=eTail;
      }
      else if(eHead==null)
      {
          head=oHead;
          tail=oTail;
      }
      else
      {
          oTail.next=eHead;
          head=oHead;
          tail=eTail;
      }
    }
