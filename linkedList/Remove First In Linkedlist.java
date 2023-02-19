public void removeFirst(){
      // write your code here
      if(head==null)
      {
          System.out.println("List is empty");
          return ;
      }
      else 
      {
          Node temp=head.next;
          head.next=null;
          head=temp;
          size--;
          if(size==0)
          {
              tail=null;
          }
      }
    }
