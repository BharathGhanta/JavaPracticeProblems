import java.util.*;
public class InsertionSort
{
    static void sort1(int a[])
    {
        for(int i=1;i<a.length;i++)
        {
           int pos=i;
           if(a[pos-1]>a[i])
           {
               int t=a[i];
               while (pos > 0 && a[pos-1] > a[i])
                   pos--;
               for(int j=i-1;j>=pos;j--)
                   a[j + 1] = a[j];
               a[pos]=t;
           }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        int arr[] = new int[siz];
        for(int i=0;i<siz;i++)
            arr[i]=sc.nextInt();
        System.out.print("Before sorting the array elements are::");
        for(int i=0;i<siz;i++)  System.out.print("   "+arr[i]);
        sort1(arr);
        System.out.println();
        System.out.print("After sorting using Insertion sort the array elements are::");
        for(int k=0;k<arr.length;k++)  System.out.print("   "+arr[k]);
    }
}
