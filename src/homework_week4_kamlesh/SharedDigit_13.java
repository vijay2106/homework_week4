package homework_week4_kamlesh;

import java.util.Scanner;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class SharedDigit_13 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        SharedDigit_13 obj = new SharedDigit_13();
        System.out.println("Enter Numbers =");
        boolean no = obj.hasshareDigit(sc.nextInt(),sc.nextInt());
        System.out.println(no);


    }

    public boolean hasshareDigit(int x, int y) {

        if ((x < 10 || x > 99) || (y < 10 || y > 99)) {
            return false;
        }

        int xFirst = x / 10;
        int yFirst = y / 10;
        int xLast = x % 10;
        int yLast = y % 10;

        if ((xFirst == yFirst || xLast == yLast) || (xFirst == yLast || xLast == yFirst)) {
            return true;
        }
        return false;
    }
}