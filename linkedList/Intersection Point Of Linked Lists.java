public static int findIntersection(LinkedList one, LinkedList two){
      // write your code here
      int oneSz=one.size();
      int twoSz=two.size();
      Node oneHead=one.head;
      Node twoHead=two.head;
      if(oneSz>twoSz)
      {
          for(int i=0;i<oneSz-twoSz;i++)
          {
              oneHead=oneHead.next;
          }
      }
      else if(twoSz>oneSz)
      {
          for(int i=0;i<twoSz-oneSz;i++)
          {
              twoHead=twoHead.next;
          }
      }
      while(oneHead!=twoHead)
      {
          oneHead=oneHead.next;
          twoHead=twoHead.next;
      }
      return oneHead.data;
    }
