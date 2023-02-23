import java.util.*;
public class Main
{
    public static class Node
    {
        int data;
        ArrayList<Node>children=new ArrayList<>();
        Node(int data)
        {
             this.data=data;
        }
    }
    public static void main(String []args)
    {
       int []arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
       Node root=construct(arr);
       display(root);
    }
    public static Node construct(int []arr){
        Node root=null;
        Stack<Node>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
           int val=arr[i];
           if(val==-1)
           {
               st.pop();
           }
           else
           {
               Node temp=new Node(val);
               if(st.size()==0)
               {
                   root=temp;
               }
               else
               {
                   st.peek().children.add(temp);
               }
               st.push(temp);
           }
        }
        return root;
    }
    public static void display(Node root)
    {
        
        System.out.print(root.data+"->");
        for(Node temp:root.children)
        {
           System.out.print(temp.data+",");
        }
        System.out.println(".");
        for(Node temp:root.children)
        {
            display(temp);
        }
        
    }
}
