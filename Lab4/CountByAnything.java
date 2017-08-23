import java.util.Scanner;
public class CountByAnything {
    public static void main(String[] args) {
        final int MIN = 3;
        final int MAX = 300;
        final int NUMBERS_PER_LINE = 10;

        String output;
        int count_by;
        int i;
        int number_of_values = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value to count up by:");
        count_by = input.nextInt();

        for(i = MIN; i <= MAX; i += count_by){
            number_of_values++;
            output = String.format("%3d ", i);
            System.out.print(output);
            if (number_of_values % NUMBERS_PER_LINE == 0)
                System.out.println();
        }
    }
}