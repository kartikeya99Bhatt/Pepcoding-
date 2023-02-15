import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner (System.in);
    int n=scn.nextInt();
   
    int cz=1;
    int co=1;
    
    for(int i=2;i<=n;i++)
    {
        int nz=co;
        int no=cz+co;
        cz=nz;
        co=no;
    }
    System.out.println(cz+co);
 }

}
