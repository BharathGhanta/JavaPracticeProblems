import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;


public class DateFormatProgram
{


    public static void main(String args[])
    {
        Date date = new Date();
        SimpleDateFormat f1 = new SimpleDateFormat("EEE:dd/MMM/yyyy   hh:mm:ss:ms");
        SimpleDateFormat f4 = new SimpleDateFormat("yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("dd/MM/yy");
        System.out.println(f1.format(date));
        System.out.println((date));
        System.out.println(f2.format(date));
        System.out.println(f3.format(date));
    }




}
