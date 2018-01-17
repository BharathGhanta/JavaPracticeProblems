import java.io.*;
public class FileOutputStreamExample
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\SaiRam\\Desktop\\abc.txt");
            FileInputStream fis = new FileInputStream("C:\\Users\\SaiRam\\Desktop\\abc.txt");
            String s = "Writing this text to abc.txt";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.write(b);
            fos.close();

            int i=0;
            while( (i=fis.read()) != -1 )
                System.out.print((char)i);
            fis.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
