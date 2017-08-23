import java.util.Scanner;

public class Inbetween {
    public static void main(String[] args) {
        int value1, value2, range;
        Scanner input = new Scanner(System.in);             // create the input object

        System.out.println("Enter the first integer:");     // get the first value from the user
        value1 = input.nextInt();

        System.out.println("Enter the second integer:");    // get the second value from the user
        value2 = input.nextInt();

        range = Math.abs(value1 - value2);      // calculate the absolute difference between the values
        while (range <= 1){                     // check if there are any integers between the two values
            System.out.println("There are no integer values between, " + value1 + " and " + value2
                    + "\nPlease enter a new value for the second integer:");
            value2 = input.nextInt();
            range = Math.abs(value1 - value2);
        }

        int i, smallest, largest;
        smallest = Math.min(value1, value2) + 1; // count from the smallest of the two numbers offset by one
        largest = Math.max(value1, value2);      // count up to the largest of the two numbers
        for (i = smallest; i < largest; ++i)     // loop over each value and print it
            System.out.println(i);
    }
}
