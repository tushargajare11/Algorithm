package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeAnagramPalindrome {

    public static void main(String[] args) {
        int count = 0;
        int[] primeNumberArray = new int[168];
        Scanner scanner = new Scanner(System.in);

        int rangeFrom, rangeTo,flag;

        System.out.printf("Enter starting point is from 0 and ending is till 1000 ");
        rangeFrom = 0;
        rangeTo = 1000;

        System.out.printf("\nPrime numbers between %d and %d are: \n", rangeFrom, rangeTo);

        for (int i = rangeFrom; i <= rangeTo; i++) {
            if (i == 1 || i == 0)
                continue;

            flag = 1;

            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                primeNumberArray[count++]=i;
                System.out.println(i);
            }
        }
        checkAnagram(primeNumberArray);
        System.out.println("Count ::"+count);
    }
    private static void checkAnagram(int[] primeNumberArray)
    {
        for (int i = 0; i < primeNumberArray.length; i++)
        {
            int number1 = primeNumberArray[i];
            for (int j = i+1; j < primeNumberArray.length; j++)
            {
                int number2 = primeNumberArray[j];
                char[] characterArrayNumber1 = String.valueOf(number1).toCharArray();
                char[] characterArrayNumber2 = String.valueOf(number2).toCharArray();

                Arrays.sort(characterArrayNumber1);
                Arrays.sort(characterArrayNumber2);
                if (Arrays.toString(characterArrayNumber1).equals(Arrays.toString(characterArrayNumber2)))
                {
                    checkpalindrome(primeNumberArray, i);
                    break;
                }
            }
        }
    }

    private static void checkpalindrome(int[] primeNumberArray, int i)
    {
        int number = primeNumberArray[i];
        int reverse = 0;
        while (number != 0)
        {
            reverse = reverse*10 + number%10;
            number = number/10;
        }
        if (reverse == primeNumberArray[i])
        {
            System.out.println("Palindrome ::"+primeNumberArray[i]);
        }
    }

}
