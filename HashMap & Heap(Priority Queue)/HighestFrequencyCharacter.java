import java.util.*;
public class Main{
    public static void main(String []args)
    {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        char ans =higestFrequencyCharacter(str);
        System.out.println(ans);
    }
    public static char higestFrequencyCharacter(String str)
    {
        HashMap<Character,Integer>fmap=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
             Character ch=str.charAt(i);
            fmap.put(ch,fmap.getOrDefault(ch,0)+1);
        }

        int max=0;
        char ch1=str.charAt(0);
        for(Character key:fmap.keySet())
        {
            if(fmap.get(key)>max)
            {
                max=fmap.get(key);
                ch1=key;
            }
        }
        return ch1;
    }
}
