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

        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;
        }

        System.out.println();

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break it once 5 are found
        // and at the end, display the total number of even numbers found

        number = 5;
        finishNumber = 20;
        int numOfEvenNumbers = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }
            System.out.println("Even number " + number);
            number++;

            numOfEvenNumbers++;
            if (numOfEvenNumbers >= 5){
                break;
            }
            }
        System.out.println("Total even numbers found = " + numOfEvenNumbers);
    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
