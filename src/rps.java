import java.util.Random;

/**
 * Created by brienyll on 6/19/2016.
 */
public class rps {
    int comp1score, comp2score, tieCount;
    public void choices(int comp1, int comp2) {

        for (int i = 0; i <100; i++) {

            Random rand = new Random();
            comp1 = rand.nextInt(4);
            comp2 = rand.nextInt(4);
            /*
            0 = rock
            1 = scissors
            2 = paper
            3 = lizard
            4 = spock
            */

            System.out.println("AI 1 picked " + comp1 + " AI 2 picked " + comp2);

            if (comp1 == comp2) {
                System.out.println("tie game");
                tieCount += 1;
                // comp 1 chose rock
            } else if (comp1 == 0) {
                // comp 2 chose scissors
                if (comp2 == 1) {
                    System.out.println("Computer 1 picked Rock and Computer 2 picked Scissors");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                    // comp 2 chose paper
                } else if (comp2 == 2) {
                    System.out.println("Computer 1 picked Rock and Computer 2 picked Paper");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                    // comp 2 chose lizard
                } else if (comp2 == 3) {

                    System.out.println("Computer 1 picked Rock and Computer 2 picked Lizard");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                    // comp 2 chose spock
                } else {
                    System.out.println("Computer 1 picked Rock and Computer 2 picked Spock");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                }
                // comp 1 chose scissors
            } else if (comp1 == 1) {
                // comp 2 chose rock
                if (comp2 == 0) {
                    System.out.println("Computer 1 picked Scissors and Computer 2 picked Rock");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                    // comp 2 chose Paper
                } else if (comp2 == 2) {
                    System.out.println("Computer 1 picked Scissors and Computer 2 picked Paper");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                    // comp 2 chose lizard
                } else if (comp2 == 3) {

                    System.out.println("Computer 1 picked Scissors and Computer 2 picked Lizard");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                    // comp 2 chose spock
                } else {
                    System.out.println("Computer 1 picked Scissors and Computer 2 picked Spock");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                }
                // comp 1 chose paper
            } else if (comp1 == 2) {
                // comp 2 chose Rock
                if (comp2 == 0) {
                    System.out.println("Computer 1 picked Paper and Computer 2 picked Rock");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                    // comp 2 chose Scissors
                } else if (comp2 == 1) {
                    System.out.println("Computer 1 picked Paper and Computer 2 picked Scissors");
                    System.out.println("Computer 2 wins, Scissors cuts Paper");
                    comp2score += 1;
                    // comp 2 chose lizard
                } else if (comp2 == 3) {
                    System.out.println("Computer 1 picked Paper and Computer 2 picked Lizard");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                    // comp 2 chose spock
                } else {
                    System.out.println("Computer 1 picked Paper and Computer 2 picked Spock");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                }
                //comp 1 chose lizard
            } else if (comp1 == 3) {
                // comp 2 chose Rock
                if (comp2 == 0) {
                    System.out.println("Computer 1 picked Lizard and Computer 2 picked Rock");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                    // comp 2 chose Scissors
                } else if (comp2 == 1) {
                    System.out.println("Computer 1 picked Lizard and Computer 2 picked Scissors");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                    // comp 2 chose Paper
                } else if (comp2 == 2) {
                    System.out.println("Computer 1 picked Lizard and Computer 2 picked Paper");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                    // comp 2 chose spock
                } else {
                    System.out.println("Computer 1 picked Lizard and Computer 2 picked Spock");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                }
            // comp 1 chose Spock
            } else if (comp1 == 4) {
                // comp 2 chose rock
                if (comp2 == 0) {
                    System.out.println("Computer 1 picked Spock and Computer 2 picked Rock");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                    // comp 2 chose scissors
                } else if (comp2 == 1) {
                    System.out.println("Computer 1 picked Spock and Computer 2 picked Scissors");
                    System.out.println("Computer 1 wins");
                    comp1score += 1;
                    // comp 2 chose paper
                } else if (comp2 == 2) {
                    System.out.println("Computer 1 picked Spock and Computer 2 picked Paper");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                    // comp 2 chose lizard
                } else {
                    System.out.println("Computer 1 picked Spock and Computer 2 picked Lizard");
                    System.out.println("Computer 2 wins");
                    comp2score += 1;
                }
            }
        }
        System.out.println("\nPlayer 1 won " +comp1score+ " times");
        System.out.println("Player 2 won " +comp2score+ " times");
        System.out.println("The game was tied " +tieCount+ " times");
    }
    public static void main(String[] args){
        rps rps = new rps();
        rps.choices(0,0);
    }
}
