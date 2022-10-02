/*
BY STACK YOU HAVE TO ACHIVE THE QUEUE BEHAVIOR , 
add efficent
*/
public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }
     int size;
    int size() {
      // write your code here
      return size;
    }

    void add(int val) {
      // write your code here
      size++;
      mainS.push(val);
    }

    int remove() {
      // write your code here
      if(mainS.size()==0)
      {
          System.out.println("Queue underflow");
          return -1;
      }
      while(mainS.size()>1)
      {
          helperS.push(mainS.pop());
      }
      size--;
      int val=mainS.pop();
     while(helperS.size()>0)
      {
          mainS.push(helperS.pop());
      }
      helperS = new Stack<>();
      return val;
    }

    int peek() {
      // write your code here
      if(mainS.size()==0)
      {
          System.out.println("Queue underflow");
          return -1;
      }
      while(mainS.size()>1)
      {
          helperS.add(mainS.pop());
      }
      int val=mainS.pop();
      helperS.push(val);
      while(helperS.size()>0)
      {
          mainS.push(helperS.pop());
      }
      helperS = new Stack<>();
      return val;
    }
  }
