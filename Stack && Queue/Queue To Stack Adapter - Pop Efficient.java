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
      size++;
      helperQ.add(val);
      while(mainQ.size()>0)
      {
          helperQ.add(mainQ.remove());
      }
      mainQ=helperQ;
      helperQ=new ArrayDeque<>();
    }

    int pop() {
      // write your code here
      if(mainQ.size()==0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
      size--;
      return (mainQ.remove());
    }

    int top() {
      // write your code here
      if(mainQ.size()==0)
      {
          System.out.println("Stack underflow");
          return -1;
      }
       return (mainQ.element());
    }
  }
