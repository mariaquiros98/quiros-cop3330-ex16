/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int age;

        /*Prompting for age*/
        System.out.println("What is your age?");
        age = scan.nextInt();

        /*Displaying output based on user's age*/
        String output = (age > 16) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.println(output);
    }
}