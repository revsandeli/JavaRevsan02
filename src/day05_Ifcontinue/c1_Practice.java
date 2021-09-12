package day05_Ifcontinue;

public class c1_Practice {

    //32. Write a Java program to compare two numbers. Go to the editor
//Input Data:
//Input first integer: 25
//Input second integer: 39
//Expected Output
//
//25 != 39
//25 < 39
//25 <= 39

    public static void main(String [] args){
        int number1=30;
        int number2=30;

        //==
        //!=
        //<=
        //>=
        //>
        //<

        //if staments will be very usefull if you have some preconditions to print your code

        if (number1 == number2){ // if numbers are equal print below println
            System.out.println(number1 + " == " +number2);
        }

        if (number1 != number2){ // if numbers are not equal print below println
            System.out.println(number1 + " != " +number2);
        }

        if (number1 < number2){
            System.out.println(number1 + " < " + number2);
        }

        if (number1 > number2){
            System.out.println(number1 + " > " + number2);
        }

        if (number1 <= number2) {
            System.out.println(number1 + " <= " +number2);
        }

        if (number1 >= number2) {
            System.out.println(number1 + " >= " + number2);
        }

    }
}