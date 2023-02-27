import java.util.*;
public class Main
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        Node (int data,Node left,Node right)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static void main(String []args)
    {
        int []arr={12,25,37,50,62,75,87};
        Node root=construct(arr,0,arr.length-1);
        display(root);
    }
    public static Node construct(int []arr,int lo,int hi)
    {
        if(lo>hi)
        {
            return null;
        }
        int mid=(lo+hi)/2;
        Node temp=new Node(arr[mid],null,null);
        temp.left=construct(arr,lo,mid-1);
        temp.right=construct(arr,mid+1,hi);
        return temp;
    }
    public static void display(Node node)
    {
        if(node==null)
        {
            return ;
        }
        System.out.println(node.data);
        display(node.left);
        display(node.right);
    }
}
