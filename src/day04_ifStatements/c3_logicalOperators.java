package day04_ifStatements;

public class c3_logicalOperators {

    // && -- and
    // || -- or
    //  !  -- not (opposite)

    public static void main(String[] args){

        // && -- and
        System.out.println( (5>3) && (3>5) );   //(true && false) //false
                         //true && false = false
        // 5 is bigger than 3 "and" 3 is  not bigger than 5
        // result is false because first condition is true and second condition is false. When we use "&&" operator it pick false
        // if there is a false no matter other ones are true
        // the result will be false
        //exp ==>   true && true && true && false && true ==false

        System.out.println( (10<5) && (0==0));
                            //false && true  //false

        System.out.println((1==2) && (2!=2));
                          //false && false   //false

        System.out.println((10>=10) && (10<=10));
                             //true && true      // true

        //if you are using "and" operator only option that you will get your result is all conditions true
        //other then that alwasy will be false










        System.out.println("***************************");

        // || -- or
        System.out.println( (5>3) || (3>5) );
                          //(true || false) //true

        // when use "or" operator it picks TRUE so if other
        //first one is conditions are false it will still be true. in this example 5 is bigger than 3 or 3 is bigger than 5.
        //so the result will be true
        System.out.println( (10<5) || (0==0));//false || true  //true
        System.out.println((1==2) || (2!=2));//false || false   //false
        System.out.println((10>=10) || (10<=10)); //true || true  // true

        //    exp-- true ||  true ||  true ||  false || true ==true (because doesnt metter how many false you have)
        //    exp-- false || true || false == true // (or operators always give True result. doesnt metter how many false you have)














        //  shift plus \ == |
        //  shift number 7 == &



        System.out.println("************");

        //  !  -- not (opposite) this means two values are not equal.
        // !true == false
        // !!false ==> !true == > false

        boolean bool1=true;
        boolean bool2= ! (10 !=15) ; // !(true) == false
        System.out.println(bool1 && bool2); //true && false

        boolean bool3= !!!!!!bool1; //!!!!!!true
        //!!!!!false
        //!!!!true
        //true

        boolean bool4= !(15>=15);//!(true ) == false

        System.out.println( (bool3||bool4) && true );
        //(true || false ) == true
        //true && true == true

        System.out.println(("Bahast" == "bahast") || ("ridvan" != "Ridvan")); // false || true
        //java is case senstivy language //to be able to ompare 2 string they have to have exact match

        System.out.println( ("Pelin"=="Pelin ") || ("Ozgur12&"=="Ozgur21&"));// false || false
        //what ever you have in the string will be a character either number letter or space or special character

    }
}