import java.util.*;
public class thirdLargestInArray
{
    public  static int find(int []arr,int total)
    {
        Arrays.sort(arr);
        return arr[total-3];
    }
    public static void main(String args[])
    {
        int a[]={10,30,25,88,54,99,1025,2252,78};
        int tle=find(a,a.length);
        System.out.println(tle);
    }
}
