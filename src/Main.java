import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean doneA = false;
        boolean doneB = false;
        boolean done = false;
        boolean allDone = false;
        boolean doneAgain = false;
        String playA = "";
        String playB = "";
        do {
            do {
                System.out.println("Player A: Enter your Rock Paper Scissors Move [R P S]: ");
                    String inputA = in.nextLine();
                    if (inputA.equalsIgnoreCase("R") || inputA.equalsIgnoreCase("P") || inputA.equalsIgnoreCase("S")) {
                        playA = inputA;
                        doneA = true;
                    }
                    else {
                        System.out.println("That's not a correct input. Try again.");
                    }
            }while (!doneA);

            do {
                System.out.println("Player B: Enter your Rock Paper Scissors Move [R P S]: ");
                    String inputB = in.nextLine();
                    if (inputB.equalsIgnoreCase("R") || inputB.equalsIgnoreCase("P") || inputB.equalsIgnoreCase("S")) {
                        playB = inputB;
                        doneB = true;
                    }
                    else {
                        System.out.println("That's not a correct input. Try again.");
                    }
            }while (!doneB);

            do {
                if (playA.equalsIgnoreCase("R")){
                    if (playB.equalsIgnoreCase("R")){
                        System.out.println("Rock vs. Rock is a Tie!");
                        done = true;
                    }
                    else if (playB.equalsIgnoreCase("P")){
                        System.out.println("Paper covers Rock. Player B wins!");
                        done = true;
                    }
                    else {
                        System.out.println("Rock breaks Scissors. Player A wins!");
                        done = true;
                    }
                }
                else if (playA.equalsIgnoreCase("P")){
                    if (playB.equalsIgnoreCase("R")){
                        System.out.println("Paper covers Rock. Player A wins!");
                        done = true;
                    }
                    else if (playB.equalsIgnoreCase("P")){
                        System.out.println("Paper vs. Paper is a Tie!");
                        done = true;
                    }
                    else {
                        System.out.println("Scissors cut Paper. Player B wins!");
                        done = true;
                    }
                }
                else {
                    if (playB.equalsIgnoreCase("R")){
                        System.out.println("Rock breaks Scissors. Player B wins!");
                        done = true;
                    }
                    else if (playB.equalsIgnoreCase("P")){
                        System.out.println("Scissors cuts Paper. Player A wins!");
                        done = true;
                    }
                    else {
                        System.out.println("Scissors vs. Scissors is a Tie!");
                        done = true;
                    }
                }
            }while (!done);

            do {
                System.out.println("Would you like to play again? (Y/N): ");
                String again = in.nextLine();
                if (again.equalsIgnoreCase("N")){
                    System.out.println("Play again soon!");
                    allDone = true;
                    doneAgain = true;
                }
                else if (again.equalsIgnoreCase("Y")){
                    System.out.println("Good Luck!");
                    doneAgain = true;
                }
                else {
                    System.out.println("Not the correct input. Try again.");
                }
            }while (!doneAgain);

        }while (!allDone);
    }
}