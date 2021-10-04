import java.util.Scanner;

public class Opdracht2 {
    public static void main(String[] args) {

        // PRINT -> Welcome message
        System.out.println("Welcome ");

        // READ -> SCANNER
        Scanner scanner = new Scanner(System.in);

        //ARRAY WITH THREE COLUMNS AND THREE ROWS
        int[][] firstLine = new int[3][3];

        // FOR LOOP TO FILL IN THE CONTENT OF THE ARRAY
        for (int outterIndex = 0; outterIndex < firstLine.length; outterIndex++) {

            // PRINT
            System.out.print("Please enter 3 numbers: ");
            for (int innerIndex = 0; innerIndex < firstLine[outterIndex].length; innerIndex++) {

                firstLine[outterIndex][innerIndex] = scanner.nextInt();
            }
        }

        // PRINT -> OUTPUT
        System.out.print("You have entered:");
        for (int outterIndex = 0; outterIndex < firstLine.length; outterIndex++) {
            for (int innerIndex = 0; innerIndex < firstLine[outterIndex].length; innerIndex++)

                System.out.print(firstLine[outterIndex][innerIndex] + " ");

        }
        System.out.println();
        System.out.println("Your table is the following:");

        for (int outterIndex = 0; outterIndex < firstLine.length; outterIndex++) {

            for (int innerIndex = 0; innerIndex < firstLine[outterIndex].length; innerIndex++) {

                System.out.print("[" + firstLine[outterIndex][innerIndex] + "] ");
            }

            System.out.println(" ");
        }

        // PRINT -> GOODBYE
        System.out.println("Goodbye.");
    }

}