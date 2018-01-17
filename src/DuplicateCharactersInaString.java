import java.lang.*;
import java.util.*;
public class DuplicateCharactersInaString
{
    static void findDup(String str)
    {
        Map<Character,Integer> strMap = new HashMap<Character, Integer>();
        char [] charArr = str.toCharArray();
        for(char ch : charArr)
        {
            if(strMap.containsKey(ch))  strMap.put(ch,strMap.get(ch)+1);
            else strMap.put(ch,1);
        }
        Set<Character> keys = strMap.keySet();
        for(char ch:keys)
            if(strMap.get(ch)>1)
                System.out.println(ch + "  is " + strMap.get(ch) + " times");
    }

    public static void main(String[] args)
    {
        String s1="India is my Country";
        findDup(s1);
    }
}
