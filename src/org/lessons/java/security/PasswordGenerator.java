package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please write your first name");
        String firstName = userInput.nextLine();

        System.out.println("Please write your second name");
        String secondName = userInput.nextLine();

        System.out.println("Please write your favourite colour");
        String favColour = userInput.nextLine();

        System.out.println("Please write your birthday day, month, and year subsequentially");

        System.out.println("only the day digits, example, 01");
        Byte birthDay = userInput.nextByte();

        System.out.println("only the month digits, 01");
        Byte birthMonth = userInput.nextByte();

        System.out.println("only the year digits, 2000");
        Short birthYear = userInput.nextShort();

        int birthSum = birthDay + birthMonth + birthYear;

        String userPassword = firstName + "-" + secondName + "-" + favColour + "-" + birthSum;

        System.out.println("first name is: " + firstName);
        System.out.println("second name is: " + secondName);
        System.out.println("favourite colour is: " + favColour);

        System.out.println("birthday is: " + birthDay + "-" + birthMonth + "-" + birthYear);

        System.out.println("generated password is: " + userPassword);

    }
}
