package quizgame;

import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        System.out.println("================================");
        System.out.println("          JAVA QUIZ GAME");
        System.out.println("================================");
        System.out.println();

        // Question 1
        System.out.println("1. Which language are we using?");
        System.out.println("A. Python");
        System.out.println("B. Java");
        System.out.println("C. C++");
        System.out.println("D. HTML");

        System.out.print("Your answer: ");
        String answer = input.nextLine().toLowerCase();

        if (answer.equals("b") || answer.equals("java")) {
            System.out.println("Correct! 🎉");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is Java.");
        }

        System.out.println();

        // Question 2
        System.out.println("2. Which symbol is used to end a Java statement?");
        System.out.println("A. .");
        System.out.println("B. ,");
        System.out.println("C. ;");
        System.out.println("D. :");

        System.out.print("Your answer: ");
        answer = input.nextLine().toLowerCase();

        if (answer.equals("c") || answer.equals(";")) {
            System.out.println("Correct! 🎉");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is ;");
        }

        System.out.println();

        // Question 3
        System.out.println("3. Which keyword is used to create a class in Java?");
        System.out.println("A. class");
        System.out.println("B. create");
        System.out.println("C. newclass");
        System.out.println("D. object");

        System.out.print("Your answer: ");
        answer = input.nextLine().toLowerCase();

        if (answer.equals("a") || answer.equals("class")) {
            System.out.println("Correct! 🎉");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is class.");
        }

        System.out.println();

        // Question 4
        System.out.println("4. Which data type is used to store whole numbers?");
        System.out.println("A. double");
        System.out.println("B. String");
        System.out.println("C. int");
        System.out.println("D. boolean");

        System.out.print("Your answer: ");
        answer = input.nextLine().toLowerCase();

        if (answer.equals("c") || answer.equals("int")) {
            System.out.println("Correct! 🎉");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is int.");
        }

        System.out.println();

        // Question 5
        System.out.println("5. Which method is used to start a Java program?");
        System.out.println("A. start()");
        System.out.println("B. main()");
        System.out.println("C. run()");
        System.out.println("D. begin()");

        System.out.print("Your answer: ");
        answer = input.nextLine().toLowerCase();

        if (answer.equals("b") || answer.equals("main")) {
            System.out.println("Correct! 🎉");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is main().");
        }

        System.out.println();

        // Final Score
        System.out.println("================================");
        System.out.println("           QUIZ FINISHED!");
        System.out.println("================================");

        System.out.println("Your score: " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent! 🏆");
        } else if (score >= 3) {
            System.out.println("Good job! 👍");
        } else {
            System.out.println("Keep practicing! 💪");
        }

        input.close();
    }
}