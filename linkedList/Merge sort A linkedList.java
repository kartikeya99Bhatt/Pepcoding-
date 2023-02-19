 public static Node getMidNode(Node hd,Node tail)
   {
       Node fast=hd;
       Node slow;
       for(slow=hd;fast.next!=tail && fast.next.next!=tail;)
       {
           fast=fast.next.next;
           slow=slow.next;
       }
       return slow;
   }
    public static LinkedList mergeSort(Node head, Node tail){
      // write your code here
      if(head==tail)
      {
           LinkedList base=new LinkedList();
           Node temp=new Node();
           temp.data=head.data;
           temp.next=null;
           base.tail=base.head=temp;
           return base;
      }
         Node mid=getMidNode(head,tail);
         LinkedList one=mergeSort(head,mid);
         LinkedList two=mergeSort(mid.next,tail);
         LinkedList trd=mergeTwoSortedLists(one,two);
         return trd;
      
    }
