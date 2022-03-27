package Algorithm;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last number till you want to guess.");
        int N = scanner.nextInt();

        int min = getNumber(scanner, N);
        System.out.println("Surprise!! I found your number ==> \'"+min +"\' <==");
    }
    private static int getNumber(Scanner scanner, int N) {
        System.out.println("Think of a number which we will guess");
        int min = 0;
        int max = N;

        while(min != max-1  )
        {
            int mid = (min+max) / 2 ;
            System.out.println("Your number is less than "+ mid +" ? y/n :");
            char userDecision = scanner.next().charAt(0);

            if (userDecision == 'y')
            {
                max = mid;
            }
            else if (userDecision == 'n')
            {
                min = mid;
            }
            else
            {
                System.err.println("Enter a correct value");
            }

        }
        return min;
    }
}
