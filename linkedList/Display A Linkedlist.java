
    public int size(){
      // write code here
      int cnt=0;
       for(Node temp=head;temp!=null;temp=temp.next)
      {
          cnt++;
      }
      return cnt;
    }

    public void display(){
      // write code here
      for(Node temp=head;temp!=null;temp=temp.next)
      {
          System.out.print(temp.data+" ");
      }
      System.out.println();
    }
