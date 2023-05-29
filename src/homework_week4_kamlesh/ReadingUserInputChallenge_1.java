package homework_week4_kamlesh;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class ReadingUserInputChallenge_1 {
    int iNo[]=new int[10];
    int sum=0,num;
    Scanner sc= new Scanner(System.in);
    public boolean hasNextInt(int no)
    {
        if(no<1)
        {
            System.out.println("Invalid No");
            return false;
        }
        else
        {
            System.out.println("Enter number #");
            no=sc.nextInt();
        }
        this.num=no;
        return true;
    }
    public void nextInt()
    {
        int i=1;
        while(i<=num)
        {
            System.out.println("Enter number #"+i+" ");
            iNo[i]=sc.nextInt();
            sum=sum+iNo[i];
            i++;
        }
        System.out.println("Sum Of Numbers Are : "+sum);
        sc.close();
    }
    public static void main(String[] args)
    {
        ReadingUserInputChallenge_1 r1=new ReadingUserInputChallenge_1();
        r1.hasNextInt(10);
        r1.nextInt();
    }
}