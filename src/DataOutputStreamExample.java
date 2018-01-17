import java.io.*;
public class DataOutputStreamExample
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\SaiRam\\Desktop\\a1.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes("\nwrite  ::");
            dos.write(65);
            dos.writeBytes("writeInt  ::");
            dos.writeInt(65);
            dos.writeBytes("\nwriteChar  ::");
            dos.writeChar(65);
            dos.flush();
            dos.close();
        }
        catch(Exception e){}
    }
}
