  public void reversePI(){
      // write your code here
      Node pre=null;
      Node curr=head;
      tail=head;
      while(curr!=null)
      {
          Node nextNode=curr.next;
          curr.next=pre;
          pre=curr;
          curr=nextNode;
      }
      head=pre;
    }
