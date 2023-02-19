public int kthFromLast(int k){
      // write your code here
      Node temp1=head;
      for(int i=0;i<k;i++)
      {
          temp1=temp1.next;
      }
     Node temp=head;
     while(temp1!=tail)
     {
         temp=temp.next;
         temp1=temp1.next;
     }
      return temp.data;
    }
