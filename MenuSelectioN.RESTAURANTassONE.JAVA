/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package restaurant.restaurantass;

/**
 *
 * @author jerryness
 */
import java.util.Scanner;

public class MenuSelection {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String selectedDishes = "";
    String input;

    System.out.println("Welcome to our restaurant! Please select a dish by entering its number from 1 to 10.");
    do {
      System.out.println("Enter the number of your selection, or C to continue, or E to finish:");
      input = sc.nextLine();
      switch (input) {
        case "1":
          selectedDishes += "1. Dish 1\n";
          break;
        case "2":
          selectedDishes += "2. Dish 2\n";
          break;
        case "3":
          selectedDishes += "3. Dish 3\n";
          break;
        case "4":
          selectedDishes += "4. Dish 4\n";
          break;
        case "5":
          selectedDishes += "5. Dish 5\n";
          break;
        case "6":
          selectedDishes += "6. Dish 6\n";
          break;
        case "7":
          selectedDishes += "7. Dish 7\n";
          break;
        case "8":
          selectedDishes += "8. Dish 8\n";
          break;
        case "9":
          selectedDishes += "9. Dish 9\n";
          break;
        case "10":
          selectedDishes += "10. Dish 10\n";
          break;
        case "C":
        case "c":
          break;
        case "E":
        case "e":
          System.out.println("You selected the following dishes:\n" + selectedDishes);
          System.out.println("You will be served shortly, thank you.");
          return;
        default:
          System.out.println("Invalid selection. Please enter a number from 1 to 10, C to continue, or E to finish.");
      }
    } while (!input.equalsIgnoreCase("E"));
  }
}
