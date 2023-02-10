import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		// write your code here
		int sz=al.size();a
		for(int j=sz-1;j>=0;j--)
		{
		    if(isPrime(al.get(j))==true)
		    {
		        al.remove(j);
		    }
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}
	public static boolean isPrime(int num)
	{
	    if(num==1)
	    {
	        return false;
	    }
	    for(int i=2;i<=(int)Math.sqrt(num);i++)
	    {
	       if(num%i==0)
	       {
	           return false;
	       }
	    }
	    return true;
	}

}
