package java_basics_package;

public class SeventhClass {
    public static void main(String[] args) {
//Using if else loop
        int dayOfTheWeek = 4;
        if (dayOfTheWeek == 1){
            System.out.println("Monday");
        } else if (dayOfTheWeek == 2){
            System.out.println("Tuesday");
        }  else if (dayOfTheWeek == 3){
            System.out.println("Wednesday");
        }else if (dayOfTheWeek == 4){
            System.out.println("Thursday");
        }else if (dayOfTheWeek == 5){
            System.out.println("Friday");
        }else if (dayOfTheWeek == 6){
            System.out.println("Saturday");
        }else if (dayOfTheWeek == 7) {
            System.out.println("Sunday");
        }else {
            System.out.println("You have not entered a valid number");
        }

    }
}
