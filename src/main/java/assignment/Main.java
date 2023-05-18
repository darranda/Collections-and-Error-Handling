package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        try {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(2);

            // Use a Set to remove duplicates
            Set<Integer> dupsRemoved = new HashSet<>(list);
            list = new ArrayList<>(dupsRemoved);

            System.out.println("List of integers without duplicates:");
            for (Integer num : list) {
                System.out.println(num);
            }

            // Calculate the sum of integers
            int sum = 0;
            for (int num : dupsRemoved) {
                sum += num;
            }

            // Calculate the sum and average of the integers
            try {
                double average = (double) sum / dupsRemoved.size();

                System.out.println("The sum of the integers is " + sum);
                System.out.println("The average of the integers is " + average);

                //Handle exceptions and try-catch-finally/ multi-catch blocks

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Process is complete!");
        }
    }
}


