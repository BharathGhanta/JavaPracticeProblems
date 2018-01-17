import java.util.Scanner;
class QSort
{
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1);

        for (int j=low; j<high; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    void sort(int [] ar, int lo, int hi)
    {
        if(lo<hi)
        {
            int pi = partition (ar,lo,hi);
            sort(ar,lo,pi-1);
            sort(ar,pi+1,hi);
        }
    }
}
public class QuickSortProgram
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
        QSort obj = new QSort();
        obj.sort(arr,0,arr.length-1);
        System.out.println("");
        System.out.print("After  sorting:");
        for(int i=0;i<siz;i++) System.out.print("   "+arr[i]);
    }
}
