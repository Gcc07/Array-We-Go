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
        for (String color : colors) {
            System.out.println(color);
        }

        double[] prices = new double[3];
        prices[0] = 9.99;
        prices[1] = 14.50;
        prices[2] = 20.00;
        for (double price : prices) {
            System.out.print(price +  " ");
        }

        int num_of_foods = getIntInput("\nHow many favorite foods?: ");
        String[] foods = new String[num_of_foods];
        String food_sentence = "Your favorite foods are: " ;
        for (int i = 0; i < num_of_foods; i++) {
            int food_number = i + 1;
            String food_input = getInput("Enter food " + (food_number) + ": ");
            foods[i] = food_input;
        }
        for (String food : foods) {
            String punctuation = ", ";
            if (foods[num_of_foods - 1].equals(food)) {
                punctuation = ".";
            }
            food_sentence += food + punctuation;
        }
        System.out.println(food_sentence);
    }

}
