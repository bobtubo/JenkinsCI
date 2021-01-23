package java_basics;

import java.util.Scanner;

public class Secondclass {
    // A code to accept numbers between 1 and 20 with validation
    public static void main(String[] args) {
        System.out.println(" Enter a number btw 1 and 20:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number <= 20 && number > 0){
            System.out.println("You have entered a valid number: " + number);
        }else
        System.out.println("The number you have entered is wrong: " + number + " Please try again !");

       // String name = scanner.nextLine();
       // int convertedname = Integer.parseInt(name);
      //  System.out.println(convertedname);


    }
}
