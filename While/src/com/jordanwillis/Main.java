package com.jordanwillis;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println();
//
//        count = 1;
//        while (true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println();
//
//        count = 1;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while(count != 6);

        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false

        System.out.println("2 is even: " + isEvenNumber(2));
        System.out.println("33 is even: " + isEvenNumber(33));
        System.out.println("62 is even: " + isEvenNumber(62));
    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
