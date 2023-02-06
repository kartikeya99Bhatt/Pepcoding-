n is a odd number
 (n=7)
  
*	*	*	*		*	*	*	*	
*	*	*				*	*	*	
*	*						*	*	
*								*	
*	*						*	*	
*	*	*				*	*	*	
*	*	*	*		*	*	*	* 
  
  (n=5)
  
*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	  
  
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // write ur code here
       int n=scn.nextInt();
       int star=n/2+1;
       int space=1;
       
       for(int i=1;i<=n;i++)
       {
           // star
           for(int j=1;j<=star;j++)
           System.out.print("*\t");
           //space 
           for(int j=1;j<=space;j++)
           System.out.print("\t");
           //star
           for(int j=1;j<=star;j++)
           System.out.print("*\t");
           //condition
           if(i>n/2)
           {
               star++;
               space-=2;
           }
           else
           {
               star--;
               space+=2;
           }
           System.out.println();
       }
    }
}
