package day29_Polymorphism.abstractionPracticee;

import MyUtil.util;

public class PhoneObjects {

    public static void main(String[] args) {
        Iphone obj1=new Iphone("iphone13", 1225);
        //as soon as we create an obj from iphone
        //i will have access to everything inside iphone class (unless if they are priavate)

        System.out.println(obj1);
        //if you try to print obj directly it will look for toString method

        obj1.texting(23423423);
        obj1.calling(123123123);
        obj1.downloadApp();

        obj1.immessage(314324234);

        util.stars();

        Samsung obj2=new Samsung("samsung s13" , 1100 );
        System.out.println(obj2);
        obj2.calling(3123123123l);
        obj2.texting(234324234);
        obj2.downloadApp();
        obj2.helloSamsung();


    }
}
