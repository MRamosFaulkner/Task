import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(10); // Duplicate

        // Remove duplicates using a Set
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        try {
            // Calculate sum
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            // Calculate average
            double average = (double) sum / numbers.size();

            // Print results
            System.out.println("Original List: " + numbers);
            System.out.println("List without duplicates: " + uniqueNumbers);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("An index out of bounds exception occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("An illegal argument exception occurred: " + e.getMessage());
        } finally {
            // Any cleanup code or final actions can go here
            System.out.println("Program execution complete.");
        }
    }
}
