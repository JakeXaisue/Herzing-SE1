//Jake Chang
//Software Engineering 1


import java.util.Scanner;

class rockPaperScissors {

    public static int result(String player1, String player2) {
        if (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("rock"))
            return 0;
        else if (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("scissors"))
            return 1;
        else if (player1.equalsIgnoreCase("rock") && player2.equalsIgnoreCase("paper"))
            return 2;
        else if (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("rock"))
            return 2;
        else if (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("scissors"))
            return 0;
        else if (player1.equalsIgnoreCase("scissors") && player2.equalsIgnoreCase("paper"))
            return 1;
        else if (player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("rock"))
            return 1;
        else if (player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("scissors"))
            return 2;
        else if (player1.equalsIgnoreCase("paper") && player2.equalsIgnoreCase("paper"))
            return 0;
        return -1;
    }

    public static void main(String[] args) {
        String player1, player2;
        //user input
        Scanner sc = new Scanner(System.in);

        int tryCount, wins = 0, ties = 0;

        //loop
        while (true) {

            //Displays welcome and prints out player1 choices.
            System.out.println("Welcome to rock, paper, and scissors. If you want to exit, enter quit.");
            System.out.println("Player 1: rock, scissors, or paper:");
            player1 = sc.nextLine();
            if (player1.equals("quit")) {
                break;
            }
            //Prints out player2 choices
            System.out.println("Player 2: rock, scissors, or paper:");
            player2 = sc.nextLine();
            if (player2.equals("quit")) {
                break;
            }
            // Displays winners, ties, or wrong choice.
            if (result(player1, player2) == 1) {
                System.out.println("Player 1 wins");
                wins++;
            } else if (result(player1, player2) == 2) {
                System.out.println("Player 2 wins");
                wins++;
            } else if (result(player1, player2) == 0) {
                System.out.println("It is a tie");
                ties++;
            } else {
                System.out.println("Wrong choice!");
            }

            //Loops again if user inputs yes
            System.out.println("Play again? ()y/n");
            String playAgain = sc.nextLine();

            //Loop ends if input is no, and prints wins and ties
            if (!playAgain.equals("y")) {
                System.out.println("Thanks for playing, Goodbye");
                System.out.println("Wins: " + wins);
                System.out.println("Ties: " + ties);
                break;
            }
        }
        sc.close();
    }
}