public class day_17 {
    public static void main(String[] args) {
        //Task 1
        boolean b1=sleepIn(false,false);//true
        boolean b2=sleepIn(true,false);//false
        boolean b3=sleepIn(false,true);//true
        System.out.println("we sleep in "+b1);
        System.out.println("we do not sleep in "+b2);
        System.out.println("we sleep in "+b3);
        System.out.println("*******************");

        //TASK 2
        boolean monkey1=monkeyTrouble(true,true);
        boolean monkey2=monkeyTrouble(false,false);
        boolean monkey3=monkeyTrouble(true,false);
        boolean monkey4=monkeyTrouble(false,true);
        System.out.print("We are in trouble if it is true"+monkey1+monkey2+monkey3+monkey4);
        System.out.println("**********");
        //Task 3

        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(4,5));
        System.out.println(sumDouble(4,4));

        System.out.println("************");
        //task4

        System.out.println("************");
        System.out.println(diff21(-24));
        //task 5

        System.out.println("************");
        System.out.println(parrotTrouble(true,21));

        System.out.println("************");
        //task 6

        System.out.println("************");
        System.out.println(makes10(5,10));

        System.out.println("************");
        //task 7
        System.out.println(notString("not bad"));

        System.out.println("************");
        //task8
        System.out.println(fronBack("ba"));
    }

    public static boolean sleepIn(boolean weekday, boolean vacation){
       /*
task1
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
*/
        if (!weekday || vacation ){

            return true;
        } else{

            return false;
        }


    }

    /*
    task2

    We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false
    */
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile){

        if (aSmile && bSmile){

            return true;
        } else if (!aSmile && !bSmile){

            return true;
        }else{
            return false;
        }

    }

/*

task3
Given two int values, return their sum. Unless the two values are the same, then return double their sum.
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

*/

    public static double sumDouble(double firstDouble, double secondDouble){
        if (firstDouble==secondDouble){

            return ((firstDouble+secondDouble)*2);
        }else {

            return firstDouble+secondDouble;
        }


    }
    /*

    task4

    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

    diff21(19) → 2
    diff21(10) → 11
    diff21(21) → 0
    diff21(24) ->6
    */
    public static int diff21(int n){



        if (n>=0 && n<=21){

            return (21-(+n));


        }else if (n>21){

            int result=((21-(+n)))*2;
            return -result;

        }
        else if (n>=-21 && n<0){

            return (21+n);

        }else{
            int result2=(21+n)*2;
            return -result2;
        }
//             alternative easier way
//        int sum = Math.abs(21 - m);
//        if (m > 21) {
//            return 2 * sum;
//        } else {
//            return sum;
//        }
    }
/*

task5
We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false

*/

    public static boolean parrotTrouble(boolean talkingParrot, int hour){
        if (talkingParrot && (hour<7 || hour>20)){
            System.out.println("We are in trouble");
            return true;

        }else {
            return false;
        }



    }

    public static boolean makes10(int a,int b){
    /*
task6
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
*/
        if (a==10 || b==10 || a+b==10){

            return true;
        }else {
            return false;
        }

    }

    public static String notString(String sentence){
        /*
task7
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
*/
        if (!(sentence.substring(0,3).equalsIgnoreCase("not"))){
            String newsentence="not "+sentence;
            return newsentence;

        }else {
            return sentence;
        }

    }
    /*
    task8
    Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"
     */
    public static String fronBack(String word){
        String result=word.substring(word.length()-1)+word.substring(1,word.length()-1)+word.substring(0,1);
        return result;
    }
}