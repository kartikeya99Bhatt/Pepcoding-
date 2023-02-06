(n=5)
*	*	*	*	*	 space=0 star=5
	*	*	*	*	 space=1 star=4
		*	*	*	 space=2 star=3
			*	*	 space=3 star=2
				*	 space=4 star=1
        
        

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        int num=scn.nextInt();
        int star=num;
        int space=0;
        
        for(int i=1;i<=num;i++)
        {
              //space
            for(int j=1;j<=space;j++)
            {
                System.out.print("\t");
            }
            
            // star
            for(int j=1;j<=star;j++)
            {
                System.out.print("*\t");
            }
            
            star--;
            space++;
             System.out.println();
        }
       

    }
}
