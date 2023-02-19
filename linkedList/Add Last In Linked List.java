 void addLast(int val) {
      // Write your code here
      Node temp=new Node();
      temp.data=val;
      temp.next=null;
      if(head==null){
          head=tail=temp;
      }
      else
      {
         Node help=head;
         while(help.next!=null)
         {
             help=help.next;
         }
         help.next=temp;
         tail=temp;
      }
      size++;
    }
