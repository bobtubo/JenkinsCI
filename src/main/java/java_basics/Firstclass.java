package java_basics;

import java.util.Scanner;

public class Firstclass {
    public static void main(String[] args) {
        System.out.print("What is your name dude?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("My name is:" + name);

    for (int i = 1; i < 10; i++){
        System.out.println(i + name);
    }
    }

}
