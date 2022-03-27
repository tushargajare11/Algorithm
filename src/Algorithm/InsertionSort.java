package Algorithm;
import java.util.Scanner;

public class InsertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter the elements  ");
        for(int i=0; i<array.length; i++)
        {
            //reading array elements from the user
            array[i]=sc.nextInt();
        }
        System.out.println(" elements are: ");
        // accessing array elements using the for loop
        for (int i=0; i<array.length; i++)
        {
            System.out.println(array[i]);
        }
        System.out.println("the sorting elements are");
        InsertionSort ob = new InsertionSort();
        ob.sort(array);

        printArray(array);
    }
}
