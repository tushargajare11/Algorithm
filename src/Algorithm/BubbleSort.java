package Algorithm;
import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the elements  ");
        for(int i=0; i<arr.length; i++)
        {
            //reading array elements from the user
            arr[i]=sc.nextInt();
        }
        System.out.println(" elements are: ");
        // accessing array elements using the for loop
        for (int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }



        System.out.println("Array Before Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);//sorting array elements using bubble sort

        System.out.println("Array After Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }


}
