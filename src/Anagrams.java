import java.util.*;
import java.lang.*;

public class Anagrams
{
    static boolean isAnagram(String st1,String st2)
    {
        char arr1[] = st1.toLowerCase().toCharArray();
        char arr2[] = st2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return (Arrays.equals(arr1, arr2));
    }
    public static void main(String args[])
    {
        String s1 = "kEEp";
        String s2 = "PeEk";
        System.out.println(isAnagram(s1,s2)?"ANAGRAM":"NOT ANAGRAM");
    }
}
