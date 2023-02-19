 public void addFirst(int val) {
      // write your code here
      Node temp=new Node();
      temp.data=val;
      temp.next=null;
      if(head==null)
      {
          head=tail=temp;
      }
      else
      {
         temp.next=head;
         head=temp;
      }
     size++;
    }
