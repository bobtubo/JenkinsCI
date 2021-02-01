package java_basics_package;


public class SecondClass {
  //Using Objects to call a method in java
    private Integer multiplierMethod(){
        int a = 10;
        int b = 20;
        return a * b;
    }

    private Integer DivisionMethod(int a, int b){

        return a / b;
    }
    public static void main(String[] args) {
        SecondClass sc = new SecondClass();
        System.out.println(sc.multiplierMethod());

        SecondClass ssc = new SecondClass();
        System.out.println(ssc.DivisionMethod(100, 50));
    }
}
