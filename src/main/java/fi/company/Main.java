package fi.company;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        int pchoice;
        int cchoice;
        int i = 0;
        int p = 0;
        int c = 0;

        do {

            do {
                System.out.println("1) Rock, 2) paper or 3) scissors?");
                choice = input.nextLine();
            }
            while (!choice.equals("1") &&!choice.equals("2") &&!choice.equals("3") && !choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors"));

            if (choice.equals("1") | choice.equals("rock")) {
                pchoice = 0;
                System.out.println("You chose rock.");
            } else if (choice.equals("2") | choice.equals("paper")) {
                pchoice = 1;
                System.out.println("You chose paper.");
            } else {
                pchoice = 2;
                System.out.println("You chose scissors.");
            }

            cchoice = (int) (Math.random() * 3);
            if (cchoice == 0) {
                System.out.println("Computer chose rock.");
            } else if (cchoice == 1) {
                System.out.println("Computer chose paper.");
            } else {
                System.out.println("Computer chose scissors.");
            }

            if (pchoice == cchoice) {
                System.out.println("It's a tie.");
            } else if (pchoice == 0 && cchoice == 1) {
                System.out.println("Computer wins.");
                c = c + 1;
            } else if (pchoice == 0 && cchoice == 2) {
                System.out.println("You win!");
                p = p + 1;
            } else if (pchoice == 1 && cchoice == 2) {
                System.out.println("Computer wins.");
                c = c + 1;
            } else if (pchoice == 1 && cchoice == 0) {
                System.out.println("You win!");
                p = p + 1;
            } else if (pchoice == 2 && cchoice == 0) {
                System.out.println("Computer wins.");
                c = c + 1;
            } else {
                System.out.println("You win!");
                p = p + 1;
            }

            i++;

        } while (i < 3);

        System.out.println("Score: " + p + " - " + c);
        if (p > c) {
            System.out.println("You win best of three!");
        } else if (p < c) {
            System.out.println("Computer wins best of three.");
        } else {
            System.out.println("It's a tie.");
        }
    }
}