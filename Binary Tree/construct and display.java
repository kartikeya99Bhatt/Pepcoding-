import java.util.*;
public class Main {
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static class Pair
    {
        Node node;
        int state;
        Pair(Node node,int state)
        {
            this.node=node;
            this.state=state;
        }
    }
    
    public static Node construct(Integer []arr)
    {
        Stack<Pair>st=new Stack<>();
        Node root=null;
        int i=0;
        while(i<arr.length)
        {
           System.out.println(i);
            if(arr[i]==null)
            {
                st.peek().state++; 
                if(st.peek().state==3)
                st.pop();
                i++;
               continue;
            }
             Node newNode=new Node(arr[i]);
            if(root==null)
            {
                root=newNode;
                st.push(new Pair(newNode,1));
                i++;
            }
            else 
            {
                Pair temp=st.peek();
                if(temp.state==1)
                {
                    temp.state++;
                    temp.node.left=newNode;
                   st.push(new Pair(newNode,1));
                   i++;
                }
                else if(temp.state==2)
                {
                    temp.state++;
                    temp.node.right=newNode;
                    st.push(new Pair(newNode,1));
                    i++;
                }
                else if(temp.state==3)
                {
                    st.pop();
                }
            }
           
        }
        
        
        return root;
    }
    public static void display(Node node)
    {
        if(node==null)
        {
            return ;
        }
        if(node.left!=null)
        {
            System.out.print(node.left.data+"-");
        }
        else
        {
            System.out.print("-");
        }
        System.out.print(node.data+"-");
        if(node.right!=null)
        {
            System.out.println(node.right.data);
        }
        else
        {
            System.out.println();
        }
        display(node.left);
        display(node.right);
        
    }
    public static void main (String []args)
    {
        Integer []arr={50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
        Node root=construct(arr);
        display(root);
    }
}
