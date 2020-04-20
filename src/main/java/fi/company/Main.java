package fi.company;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        String choice2;

        do {
            System.out.println("Rock, paper or scissors?");
            choice = input.nextLine();
        }
        while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors"));
        System.out.println("You chose " + choice + ".");

        int number = (int) (Math.random() * 3);
        if (number == 0) {
            choice2 = "rock";
            System.out.println("Computer chose rock.");
        } else if (number == 1) {
            choice2 = "paper";
            System.out.println("Computer chose paper.");
        } else {
            choice2 = "Scissors";
            System.out.println("Computer chose scissors.");
        }

        if (choice.equals(choice2)) {
            System.out.println("It's a tie.");
        } else if (choice.equals("rock") && choice2.equals("paper")) {
            System.out.println("Computer wins.");
        } else if (choice.equals("rock") && choice2.equals("scissors")) {
            System.out.println("You win!");
        } else if (choice.equals("paper") && choice2.equals("scissors")) {
            System.out.println("Computer wins.");
        } else if (choice.equals("paper") && choice2.equals("rock")) {
            System.out.println("You win!");
        } else if (choice.equals("scissors") && choice2.equals("rock")) {
            System.out.println("Computer wins.");
        } else {
            System.out.println("You win!");
        }
    }
}