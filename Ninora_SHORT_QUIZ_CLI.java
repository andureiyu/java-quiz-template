/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ninora__short_quiz_cli;


import java.util.Scanner;
/**
 *
 * @author mapninora
 */
public class Ninora__SHORT_QUIZ_CLI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scores = 0; 
        char userAnswer;

     
        System.out.println("1. Sharks are mammals.");
        System.out.println("A) True");
        System.out.println("B) False");
        System.out.print("Your Answer: ");
        userAnswer = Character.toUpperCase(scan.nextLine().charAt(0));
        if (userAnswer == 'B') {
            //System.out.println("Correct");
            scores++;
        } else {
            //System.out.println("Incorrect");
        }

        System.out.println("\n2. The hummingbird egg is the world's smallest bird egg.");
        System.out.println("A) True");
        System.out.println("B) False");
        System.out.print("Your Answer: ");
        userAnswer = Character.toUpperCase(scan.nextLine().charAt(0));
        if (userAnswer == 'A') {
            //System.out.println("Correct");
            scores++;
        } else {
           // System.out.println("Incorrect");
        }
       
        System.out.println("\n3. A monkey was the first non-human to go into space.");
        System.out.println("A) True");
        System.out.println("B) False");
        System.out.print("Your Answer: ");
        userAnswer = Character.toUpperCase(scan.nextLine().charAt(0));
        if (userAnswer == 'B') {
            //System.out.println("Correct");
            scores++;
        } else {
           // System.out.println("Incorrect");
        }

        System.out.println("\n4. The two longest rivers in the world are the Mississippi and the Nile.");
        System.out.println("A) True");
        System.out.println("B) False");
        System.out.print("Your Answer: ");
        userAnswer = Character.toUpperCase(scan.nextLine().charAt(0));
        if (userAnswer == 'B') {
           // System.out.println("Correct");
            scores++;
        } else {
           // System.out.println("Incorrect");
        }

        System.out.println("\n5. Venezuela is home to the world's highest waterfall.");
        System.out.println("A) True");
        System.out.println("B) False");
        System.out.print("Your Answer: ");
        userAnswer = Character.toUpperCase(scan.nextLine().charAt(0));
        if (userAnswer == 'A') {
            //System.out.println("Correct");
            scores++;
        } else {
           // System.out.println("Incorrect");
        }

        System.out.print("\nScore: " + scores + "/5");
        
       
        if (scores < 3) {
            System.out.print(" - You Failed, Please Try again");
        } else if (scores < 5) {
            System.out.print(" - You Passed");
        } else {
            System.out.print(" - Perfect");
        }
    }
}