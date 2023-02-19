 public int getFirst(){
      // write your code here
      if(head==null)
      {
          System.out.println("List is empty");
          return -1;
      }
      else
      {
          return head.data;
      }
    }

    public int getLast(){
      // write your code here
      if(head==null)
      {
          System.out.println("List is empty");
          return -1;
      }
      else
      {
         Node temp=head;
         while(temp.next!=null)
         {
             temp=temp.next;
         }
         return temp.data;
      }
    }

    public int getAt(int idx){
      // write your code here
       if(head==null)
      {
          System.out.println("List is empty");
          return -1;
      }
      else if(idx<0||idx>=size)
      {
          System.out.println("Invalid arguments");
          return -1;
      }
      else
      {
         int cnt=0;
         Node temp=head;
         while(cnt<idx)
         {
            temp=temp.next; 
            cnt++;
         }
         return temp.data;
      }
    }
