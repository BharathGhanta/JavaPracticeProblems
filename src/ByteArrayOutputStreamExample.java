import java.io.*;
public class ByteArrayOutputStreamExample
{
    public static void main(String[] args)
    {
        try
        {
            FileOutputStream fos1 = new FileOutputStream("C:\\Users\\SaiRam\\Desktop\\a1.txt");
            //FileInputStream fis1 = new FileInputStream("C:\\Users\\SaiRam\\Desktop\\abc.txt");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(65);
            baos.write(65);
            baos.write(65);
            baos.writeTo(fos1);
        }
        catch(Exception e){}

    }



}
