 public void addAt(int idx, int val){
      // write your code here
      Node temp=new Node();
      temp.data=val;
      temp.next=null;
      if(idx<0||idx>size)
      {
          System.out.println("Invalid arguments");
          return;
      }
      else if(idx==0) // adding first
      {
         addFirst(val);
       
      }
      else if(idx==size)
      {
        addLast(val);
      }
      else
      {
         Node fow=head;
         Node pre=head;
         int cnt=0;
         while(cnt<idx)
         {
             pre=fow;
             fow=fow.next;
             cnt++;
         }
         
         pre.next=temp;
         temp.next=fow;
         size++;
      }
      
    }
