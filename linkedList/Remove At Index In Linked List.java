public void removeAt(int idx) {
      // write your code here
      if(idx<0 || idx>=size)
      {
          System.out.println("Invalid arguments");
      }
      else if(size==0)
      {
          System.out.println("List is empty");
      }
      else if(idx==0)
      {
         removeFirst(); 
      }
      else if(idx==size-1)
      {
          removeLast();
      }
      else
      {
          Node pre=null;
          Node fow=head;
          for(int i=0;i<idx;i++)
          {
              pre=fow;
              fow=fow.next;
          }
          pre.next=fow.next;
          fow.next=null;
          size--;
      }
    }
