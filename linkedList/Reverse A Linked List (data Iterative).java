public Node getNode(int idx) {
        Node temp=head;
        for(int curr=0;curr<idx;curr++)
        {
         temp=temp.next;   
        }
        return temp;
    }
    public void reverseDI() {
      // write your code here
      int lo=0;
      int hi=size-1;
      while(lo<hi)
      {
          Node fr=getNode(lo);
          Node sc=getNode(hi);
          int temp=fr.data;
          fr.data=sc.data;
          sc.data=temp;
          lo++;
          hi--;
      }
    }
    
