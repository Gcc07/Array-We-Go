/* Filename: ArrayCreationLab
 * Date: 9/30/2025
 * Author: Gabriel Cardenas
 */

import java.util.Scanner;

public class ArrayCreationLab {
    public static Scanner scanner = new Scanner(System.in);
    
    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }


    public static void main(String[] args) {
        int[] scores;
        scores = new int[5];
        System.out.println(scores.length);

        String[] colors = {"Red", "Green", "Blue"};
        for (String color : colors) { // Enhanced for loop
            System.out.println(color); // Print color in colors
        }

        double[] prices = new double[3]; // Creating double array + initiating
        prices[0] = 9.99;
        prices[1] = 14.50;
        prices[2] = 20.00;
        for (double price : prices) { // Another enhanced for loop
            System.out.print(price +  " "); // Seperating elements with a space
        }

        int num_of_foods = getIntInput("\nHow many favorite foods?: "); // # of foods in array
        String[] foods = new String[num_of_foods]; // Initiallizing array w/ number of foods
        String food_sentence = "Your favorite foods are: " ; // Creating a string to add to for later
        for (int i = 0; i < num_of_foods; i++) { // For loop to fill the array with foods
            int food_number = i + 1; // Keeps track of which # food for the enter statement below (just the index + 1)
            String food_input = getInput("Enter food " + (food_number) + ": "); // Get food input
            foods[i] = food_input; // fill string array.
        }
        for (String food : foods) { // Loop to print the sentence whilst adding appropriate punctuation if the element is the final in the array.
            String punctuation = ", ";
            if (foods[num_of_foods - 1].equals(food)) {
                punctuation = ".";
            }
            food_sentence += food + punctuation;
        }
        System.out.println(food_sentence);
    }

}
