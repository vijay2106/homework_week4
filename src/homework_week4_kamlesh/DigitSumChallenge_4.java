package homework_week4_kamlesh;

import java.util.Scanner;

/**
 * Digit Sum Challenge
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint: Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */

public class DigitSumChallenge_4 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number for sum =");
        // Should return 8 => 1 + 2 + 5 = 8
        System.out.println("Sum of number is = " + sumDigits(1));
        int sum = sc.nextInt();

    }

    public static int sumDigits( int number){
        int num = sc.nextInt();


        if (number < 10) {
            return -1;
        }

        int sumDigits = 0;

        String numberToString = Integer.toString(number);

        for(char c : numberToString.toCharArray()) {

            sumDigits += Integer.parseInt(String.valueOf(c));
        }
        return sumDigits;
    }

}