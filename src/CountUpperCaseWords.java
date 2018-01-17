import java.io.*;
import java.util.*;
public class CountUpperCaseWords
{
    public static void main(String[] args)
    {
        try
        {
            Reader rr = new FileReader("C:\\Users\\SaiRam\\Desktop\\CountUpperCase.txt");
            String str="";
            int data=0;
            while((data=rr.read()) != -1)   str+=(char)data;

            System.out.println(str);

            String [] words = str.split("\\s");
            for (String w : words)
            {
                boolean flag = true;
                for(char i : w.toCharArray() )
                {
                    if(Character.isLowerCase(i) )
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag)    System.out.println(w);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            String path = "C:\\Users\\SaiRam\\Desktop\\CountUpperCase.txt";
            System.out.println(path);
            Map <String,Integer> UniqueMap = new HashMap<String, Integer>();
            String[] words = path.split("\\\\");
            for (String w:words) System.out.println(w);
            for (String w:words)
            {
                if(UniqueMap.containsKey(w))    UniqueMap.put(w,UniqueMap.get(w)+1);
                else                            UniqueMap.put(w,1);
            }
            Set<String> keys = UniqueMap.keySet();
            for(String w:keys)
                System.out.println(w + "  is " + UniqueMap.get(w) + " times");

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
