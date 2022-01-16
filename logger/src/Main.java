import java.util.*;

public class Main {
    public static void main(String[] args) {
        final int N;
        final int M;
        int f;
        Filter filter;
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        List<Integer> source = new ArrayList<>();
        Random random = new Random();

        try {
            logger.log("Running the program");
            logger.log("Asq user to enter input data for a list");
            System.out.print("Please enter size of the list: ");
            N = scanner.nextInt();
            System.out.print("Please enter an upper bound for the values: ");
            M = scanner.nextInt();
            logger.log("Creating and filling the list");
            for (int i = 0; i < N; i++) {
                source.add(random.nextInt(M));
            }
            System.out.println("Here is a random list: " + source);
            logger.log("Ask the user to enter the input data for filtering");
            System.out.print("Please enter a bound for filter: ");
            f = scanner.nextInt();
            filter = new Filter(f);
            System.out.print("Filtered list: " + filter.filterOut(source) + "\n");
            logger.log("Ending the program");
        } catch (InputMismatchException e) {
            logger.log("Incorrect data entered");
        }
    }
}