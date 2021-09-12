/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Deirdre Gruman-Walsh
 */
import java.util.Scanner;           //data type for user input

public class Saying_Hello {
    public static void main(String[] args) {
        //User input request display
        System.out.print("What is your Name? " );
        //Storing user input
        Scanner UserName_Input = new Scanner(System.in);
        //Displaying/Greeting user with given input
        System.out.println("Hello, " + UserName_Input.nextLine() + ", nice to meet you!");
    }
}
