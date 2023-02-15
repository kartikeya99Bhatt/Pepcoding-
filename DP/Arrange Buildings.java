import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int b=1;
    int s=1;
    for(int i=2;i<=n;i++)
    {
        int nb=s;
        int ns=s+b;
        b=nb;
        s=ns;
    }
    int osde=b+s;
    System.out.println(osde*osde);
 }

}
