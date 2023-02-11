import java.io.*;
import java.util.*;
public class Main {
public static void main(String[] args) throws Exception {
 Scanner scn=new Scanner(System.in);
 int n=scn.nextInt();
 int m=scn.nextInt();
 printMazePaths(1,1,n,m,"");
}

// sr - source row
// sc - source column
// dr - destination row
// dc - destination column
public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
    if(sr==dr && sc==dc)
    {
        System.out.println(psf);
        return ;
    }
    // horizontal 
    for(int sp=1;sp+sc<=dc;sp++)
    {
        printMazePaths(sr,sc+sp,dr,dc,psf+'h'+sp);
    }
    // vertical
     for(int sp=1;sp+sr<=dr;sp++)
    {
        printMazePaths(sr+sp,sc,dr,dc,psf+'v'+sp);
    }
    // digonal
     for(int sp=1;sp+sr<=dr && sp+sc<=dc;sp++)
    {
        printMazePaths(sr+sp,sc+sp,dr,dc,psf+'d'+sp);
    }
}

}
