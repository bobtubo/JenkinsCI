package java_basics_package;

public class NinthClass {
    //Arrays
    public static void main(String[] args) {
        String[] carTypes = {"Toyota", "Honda", "LandRover", "Pasat", "Ferrari"};

        //printout all the car types
        for(String i: carTypes){
            System.out.println(i);
        }
        System.out.println(" - -- - - -  - - - -  - - - - - - - -  - - -- - ");
        //printout value of a particular index
        System.out.println(carTypes[0]);
        System.out.println(carTypes[4]);
        //System.out.println(carTypes[10]); // this will trow ArrayIndexOutOfBoundsException

        System.out.println(" - -- - - -  - - - -  - - - - - - - -  - - -- - ");

        //getting length of array
        System.out.println(carTypes.length);

        System.out.println(" - -- - - -  - - - -  - - - - - - - -  - - -- - ");

        //int arrays
        int[] numArrays = {1,2,3,5,8,13,21,34};
        //finding length
        System.out.println(numArrays.length);
        System.out.println(" - -- - - -  - - - -  - - - - - - - -  - - -- - ");
        //finding value by index
        System.out.println("fifth index is : " +numArrays[5]);


        System.out.println(" - -- - - -  - - - -  - - - - - - - -  - - -- - ");
        //multiple arrays
        int[][] nArrays = {{1,2,3,4},{10,20,30,40}, {60,80,90,120} };
        int i = nArrays[0][2];
        int j = nArrays[1][2];
        System.out.println(i);
        System.out.println(j);

        System.out.println(" - -- - - -  - - - -  - - - - - - - -  - - -- - ");
        //printing out all the items in the mutliple array
        for(int k = 0; k <nArrays.length; k++){
            for(int t=0; t< nArrays[k].length; t++){
                System.out.println(nArrays[k][t]);
            }}
    }
}
