package homework_week4_kamlesh;

/**
 * Palindrome Number
 * Write a method called isPalindrome with one int parameter called number.
 * The method needs to return a boolean.
 * It should return true if the number is a palindrome number otherwise it should return false.
 * Check the tips below for more info about palindromes.
 * Example Input/Output
 * isPalindrome(-1221); → should return true
 * isPalindrome(707); → should return true
 * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
 * 11212.
 */

import java.util.Scanner;


public class PalindromeNumber_5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String [] args) {

        System.out.println(isPalindrome (1));
        int num = sc.nextInt();
    }

    public static boolean isPalindrome(int num){
        System.out.println("isPalibdrime number =");
        int num1 = sc.nextInt();
        int reverse = 0;
        int originalNumber = num;

        while (num !=0){
            int lastDigit = num % 10;
            reverse = (reverse * 10) + lastDigit;
            num /= 10;
        }

        return originalNumber == reverse;

    }
}