package com.mycompany.progpoepart1;

import java.util.Scanner;

public class Progpoepart1 {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Instantiate the Login class (assuming 'Login' is the class handling app state)
        Login app = new Login();

        // Display header if needed
        displayHeader(scanner);

        System.out.println("\n--- REGISTRATION FORM ---");

        // Prompt user to enter their first name
        System.out.print("Enter First Name: ");
        app.setFirstName(scanner.nextLine());

        // Prompt user to enter their last name
        System.out.print("Enter Last Name: ");
        app.setLastName(scanner.nextLine());

        // Prompt user to enter their username
        System.out.print("Choose Username (must contain _ and be <= 5 chars): ");
        app.setUsername(scanner.nextLine());

        // Prompt user to enter their password
        System.out.print("Choose Password (8+ chars, A-Z, 0-9, special char): ");
        app.setPassword(scanner.nextLine());

        System.out.print("Enter Cell Number (+27 followed by 9 digits): ");
        app.setCellPhoneNumber(scanner.nextLine());

        System.out.println("\n--- REGISTRATION RESULT ---");

        String result = app.registerUser();
        System.out.println(result);

        // Only allow login if registration succeeded
        if (result.contains("successfully added")) {

            System.out.println("\n--- LOGIN SECTION ---");

            System.out.print("Username: ");
            String loginUser = scanner.nextLine();

            System.out.print("Password: ");
            String loginPass = scanner.nextLine();

            System.out.println("\n--- LOGIN RESULT ---");
            System.out.println(app.returnLoginStatus(loginUser, loginPass));

        } else {
            System.out.println("\nRegistration failed. Please restart and try again.");
        }

        System.out.println("\n==============================================");
        scanner.close();
    }

    public static void displayHeader(Scanner scanner) {

        System.out.println("==============================================");
        System.out.println("         QUICKCHAT REGISTRATION SYSTEM       ");
        System.out.println("==============================================");
        
        // Simulating login functionality
        System.out.println("Welcome to the Login System!");
        
        // Prompt for username
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        // Prompt for password
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        // Simulate authentication
        if (username.equals("admin") && password.equals("password")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid username or password.");
        }
        
        // Note: Do NOT call scanner.close() here, as it closes System.in for the entire application.
    }
}
