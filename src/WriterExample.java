import java.io.*;
public class WriterExample
{
    public static void main(String args[])
    {
        try
        {
            Reader rr = new FileReader("C:\\Users\\SaiRam\\Desktop\\a2.txt");
            String str = "";
            int data = rr.read();
            while (data != -1)
            {
                str += (char)data;
                data = rr.read();
            }
            System.out.println(str);
            rr.close();
            Writer wr = new FileWriter("C:\\Users\\SaiRam\\Desktop\\a2.txt");
            wr.write(str);
            str = "Appended this data using a java program";
            wr.write(str);
            wr.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
