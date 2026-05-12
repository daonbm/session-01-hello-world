package vn.edu.rikkei.session01.input_output;

import java.util.Scanner;

public class IOExample {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hi Java World");
        System.out.println("Hello World 2");

        String name = "Alice";
        System.out.printf("My name is %s", name);

        System.out.println("Enter your name: ");
        String yourName = scanner.nextLine();
        System.out.println("Your name is: " + yourName);
    }
}
