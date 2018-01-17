/** Reverse each word in a string*/
public class ReverseEachWord
{
    static String reverseWord(String str)
    {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    public static void main(String args[])
    {
        String str = "Hi this is a training program";
        System.out.println("Before Reversing::  "+str);
        System.out.print  ("After  Reversing::  ");
        String[] words = str.split("\\s");
        for(String i:words)
        {
            i=reverseWord(i);
            System.out.print(i+" ");
        }
        //System.out.println(str);
    }
}
