import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(power(x,n));
    }

    public static int power(int x, int n){
      if(n==0)return 1;
      
      int val=power(x,n/2);
      val=val*val;
      if(n%2==1)val=val*x;
      return val;
    }

}
