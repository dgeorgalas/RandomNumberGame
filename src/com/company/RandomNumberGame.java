package com.company;
import java.util.Scanner;
import java.util.Random;

public class RandomNumberGame {

    public static void playAgain() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You were able to get it right.... wanna play again? Answer yes or no");
        String answer = scan.nextLine();
        while(answer.equals("yes")) {
            playGame();
            System.out.println("You were able to get it right.... wanna play again? Answer yes or no");
            answer = scan.nextLine();
        }
        System.out.println("I see that you are a coward, goodbye");
    }

    public static void playGame() {
        boolean isGuessRight = false;
        int upperbound = 100;
        int numberGuessed;

        Random rand = new Random();
        Scanner numScan = new Scanner(System.in);
        int randomNum = rand.nextInt(upperbound);
        System.out.println(randomNum);
        System.out.println("I have thought of a random number from 0 to 100, take a guess");
        while (!isGuessRight) {
            numberGuessed = numScan.nextInt();
            if (numberGuessed == randomNum) {
                System.out.println("Wow you guessed it right.... it must've been luck");
                isGuessRight = true;
            } else {
                System.out.println("HAHA try again");
            }
        }
    }
}
