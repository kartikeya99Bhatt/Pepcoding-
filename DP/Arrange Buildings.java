import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    long b=1;
    long s=1;
    for(int i=2;i<=n;i++)
    {
        long nb=s;
        long ns=s+b;
        b=nb;
        s=ns;
    }
    long osde=b+s;
    System.out.println(osde*osde);
 }

}
