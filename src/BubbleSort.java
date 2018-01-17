import java.util.*;
public class BubbleSort
{
    static void sort(int[] ar,int limit)
    {
        int t=limit;
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<limit;j++)
                if(ar[j]>ar[j+1])
                {
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            limit--;
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        int[] arr = new int[siz];
        for(int i=0;i<siz;i++)
            arr[i]=sc.nextInt();
        System.out.print("Before sorting:");
        for(int i=0;i<siz;i++) System.out.print("   "+arr[i]);
        sort(arr,arr.length-1);
        System.out.println("");
        System.out.print("After  sorting:");
        for(int i=0;i<siz;i++) System.out.print("   "+arr[i]);
    }
}
