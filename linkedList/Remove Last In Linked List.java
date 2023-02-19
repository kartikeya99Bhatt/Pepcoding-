 public void removeLast(){
      // write your code here
      if(size==0){
          System.out.println( "List is empty");
      }
      else if(size==1)
      {
          head=tail=null;
      }
      else
      {
          Node fow=head.next;
          Node pre=head;
          while(fow!=tail)
          {
              pre=pre.next;
               fow=fow.next;
          }
          pre.next=null;
          tail=pre;
          size--;
      }
    }
