import java.io.*;
import java.util.Scanner;

public class TextToHtml
{
    public static void main(String [] args)
    {
        try
        {
            File f = new File("C:\\Users\\SaiRam\\Desktop\\ppp.txt");
            //if(f.createNewFile())
              //  System.out.println("Created now, Previously no file existed");

            String fname = f.getName().substring(0,f.getName().lastIndexOf('.'));

            if(f.renameTo(new File(fname+".html"))) {
                System.out.println("Changed Extension Successfully");
            }
            else{
                System.out.print("failed");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
