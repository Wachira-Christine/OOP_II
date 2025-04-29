//Importing challenge
import java.util.Scanner;//Importing the Scanner class

// Code is meant to ask user to input their name then displays a message
public class challenge4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);// Creating a Scanner object

        System.out.println(" Enter your name: ");
        String name = input.nextLine(); // Reads a line of text from the user

        System.out.println("Hello, " + name + "!");

        input.close();
    }
}
