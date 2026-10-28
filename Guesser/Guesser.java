import java.util.Scanner;

public class Guesser {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        new Guesser();
    }

    public Guesser() {
        int choice = -1;

        while (choice != 0) {
            choice = menu();

            if (choice == 1) {
                humanGuesser();
            } else if (choice == 2) {
                computerGuesser();
            } else if (choice != 0) {
                System.out.println("Please enter 0, 1, or 2.");
            }
        }

        input.close();
    }

    public int menu() {
        System.out.println("\n0) Exit");
        System.out.println("1) Human Guesser");
        System.out.println("2) Computer Guesser");
        System.out.print("\nPlease enter 0-2: ");

        return Integer.parseInt(input.nextLine().trim());
    }

    public void humanGuesser() {
        int number = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int turns = 0;

        System.out.println("\nhuman guesser");

        while (guess != number) {
            turns++;
            System.out.print(turns + ") Please enter a number: ");
            guess = Integer.parseInt(input.nextLine().trim());

            if (guess < number) {
                System.out.println("too low...");
            } else if (guess > number) {
                System.out.println("too high...");
            } else {
                System.out.println("got it!");
            }
        }

        System.out.println("\nVery good!");
    }

    public void computerGuesser() {
        int low = 1;
        int high = 100;
        int turns = 0;
        boolean correct = false;

        System.out.println("\ncomputer guesser");
        System.out.println("Think of a number from 1 to 100.");

        while (!correct && low <= high) {
            int guess = (low + high) / 2;
            turns++;

            System.out.println(turns + ") I guess " + guess);

            String answer = "";
            boolean valid = false;

            while (!valid) {
                System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
                answer = input.nextLine().trim();

                if (answer.equalsIgnoreCase("h")
                        || answer.equalsIgnoreCase("l")
                        || answer.equalsIgnoreCase("c")) {
                    valid = true;
                } else {
                    System.out.println("Please enter H, L, or C.");
                }
            }

            if (answer.equalsIgnoreCase("h")) {
                high = guess - 1;
            } else if (answer.equalsIgnoreCase("l")) {
                low = guess + 1;
            } else {
                correct = true;
            }
        }

        if (!correct) {
            System.out.println("Those answers don't match a number from 1 to 100.");
        }
    }
}