public class CountByThrees {
    public static void main(String[] args) {
        final int MIN = 3;
        final int MAX = 300;
        final int COUNT_BY = 3;
        final int NEW_LINE_MULTIPLE = 30;
        String output;
        int i;
        for(i = MIN; i <= MAX; i += COUNT_BY){
            output = String.format("%3d ", i);
            System.out.print(output);
            if (i % NEW_LINE_MULTIPLE == 0)
                System.out.println();
        }
    }
}
