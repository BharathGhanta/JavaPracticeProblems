import java.util.*;
class MSort
{
    void merge(int arr[], int l, int m, int r)
    {
        int [] temp = new int[r-l+1];

        int l1 = l;
        int r1 = m;
        int l2 = m+1;
        int r2 = r;
        int i=0;
        while( l1<=r1 && l2<=r2 )
        {
            if (arr[l1] <= arr[l2]) temp[i++] = arr[l1++];
            else temp[i++] = arr[l2++];
        }
        while(l1<=r1)       temp[i++] = arr[l1++];
        while(l2<=r2)       temp[i++] = arr[l2++];

        m=0;
        System.out.println(Arrays.toString(temp));
        for(i=l;i<=r;i++)
            arr[i]=temp[m++];
        //System.out.println(Arrays.toString(arr));




    }

    void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
public class MergeSortExample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int siz = sc.nextInt();
        int[] arr = new int[siz];
        for(int i=0;i<siz;i++)
            arr[i]=sc.nextInt();
        System.out.print("Before sorting:");
        for(int i=0;i<siz;i++) System.out.print("   "+arr[i]);
        MSort obj = new MSort();
        obj.sort(arr,0,arr.length-1);
        System.out.println("");
        System.out.print("After  sorting:");
        for(int i=0;i<siz;i++) System.out.print("   "+arr[i]);
    }
}
