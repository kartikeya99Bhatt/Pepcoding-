import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []arr=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=scn.nextInt();
    }
    HashMap<Integer,Boolean>map=new HashMap<>();

    // mark all elements true
    for(int val:arr)
    {
        map.put(val,true);
    }
    // starting point 
    for(int val:arr)
    {
        if(map.containsKey(val-1))
        {
            map.put(val,false);
        }
    }
    // jo starting paint h v true;

    int maxCount=0;
    int oStarting=0;
    
    for(int i=0;i<arr.length;i++)
    {
        if( map.get(arr[i]) )
        {
            int tCount=1;
            int tempSp=arr[i];
            
            while(map.containsKey(tempSp+tCount)==true)
            {
              tCount++;
            }
            if(maxCount<tCount)
            {
                maxCount=tCount;
                oStarting=tempSp;
            }

        }

    }

    for(int i=0;i<maxCount;i++)
    {
        System.out.println(oStarting+i);
    }

 }

}
