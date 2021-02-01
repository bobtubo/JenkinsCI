package java_basics_package;

import java.util.Scanner;

public class ThirdClass {
    //writing dynamic code
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Hi " + name);
        System.out.println("Hi " + name.toLowerCase());
        System.out.println("Hi " + name.toUpperCase());
    }
}
