public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            // write your code hered
            Node Ohead=null;
            Node Otail=null;
            
            Node temp1=l1.head;
            Node temp2=l2.head;
            
            while(temp1!=null && temp2!=null)
            {
                if(temp1.data<temp2.data)
                {
                     Node temp=new Node();
                     temp.data=temp1.data;
                     temp.next=null;
                    if(Ohead==null)
                    {
                        Ohead=Otail=temp;
                    }
                    else
                    {
                        Otail.next=temp;
                        Otail=Otail.next;
                    }
                    temp1=temp1.next;
                    
                }
                else
                {
                     Node temp=new Node();
                     temp.data=temp2.data;
                     temp.next=null;
                    if(Ohead==null)
                    {
                        Ohead=Otail=temp;
                    }
                    else
                    {
                        Otail.next=temp;
                        Otail=Otail.next;
                    }
                    temp2=temp2.next;
                }
            }
            
            while(temp1!=null)
            {
                 Node temp=new Node();
                 temp.data=temp1.data;
                 temp.next=null;
                if(Ohead==null)
                {
                    Ohead=Otail=temp;
                }
                else
                {
                    Otail.next=temp;
                     Otail=Otail.next;
                }
                temp1=temp1.next;
            }
            
            while(temp2!=null)
            {
                 Node temp=new Node();
                 temp.data=temp2.data;
                 temp.next=null;
                if(Ohead==null)
                {
                    Ohead=Otail=temp;
                }
                else
                {
                    Otail.next=temp;
                     Otail=Otail.next;
                }
                temp2=temp2.next;
            }
            
            LinkedList ans=new LinkedList();
            ans.head=Ohead;
            ans.tail=Otail;
            
            return ans;
        }
