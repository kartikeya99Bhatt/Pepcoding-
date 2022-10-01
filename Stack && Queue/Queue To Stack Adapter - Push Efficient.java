public static class QueueToStackAdapter {
    Queue<Integer> mainQ;
    Queue<Integer> helperQ;

    public QueueToStackAdapter() {
      mainQ = new ArrayDeque<>();
      helperQ = new ArrayDeque<>();
    }
    int size;
    int size() {
      // write your code here
       return size;
    }

    void push(int val) {
      // write your code here
      mainQ.add(val);
      size++;
    }

    int pop() {
      // write your code here
      
         if(mainQ.size()==0)
      {
          System.out.println("Stack underflow");
         return -1;
      }
      while(mainQ.size()>1)
      {
          helperQ.add(mainQ.remove());
      }
      int val=mainQ.remove();
      mainQ=helperQ;
      size--;
      helperQ=new ArrayDeque();
      return val;
    }

    int top() {
      // write your code here
      if(mainQ.size()==0)
      {
          System.out.println("Stack underflow");
         return -1;
      }
        while(mainQ.size()>1)
      {
          helperQ.add(mainQ.remove());
      }
      int val=mainQ.remove();
      mainQ=helperQ;
      mainQ.add(val);
      helperQ=new ArrayDeque();
      return val;
    }
  }
