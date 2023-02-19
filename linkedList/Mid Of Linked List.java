 public int mid(){
      // write your code here
      Node fast;Node slow;
      for(fast=head,slow=head;fast.next!=null&&fast.next.next!=null;){
          fast=fast.next.next;
          slow=slow.next;
      }
      
      return slow.data;
    }
