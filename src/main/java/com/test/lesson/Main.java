package com.test.lesson;

import libs.SomeObject;

public class Main {


    public static void main(String[] args) {
        SomeObject sobj = new SomeObject();

        // test 1
        short test1A = 1;
        byte test1B = 1;
        System.out.println("Test 1: " + sobj.sum(test1B, test1A));

        // test 2
        int test2A = 2;
        long test2B = 10;
        System.out.println("Test 2: " + sobj.multiply(test2A, test2B));

        // test 3
        int test3A = 2;
        int test3B = 30;
        System.out.println("Test 3: " + sobj.getMaxNumber(test3A, test3B));

        // test 4
        char test4A = 'A';
        System.out.println("Test 4: " + sobj.isCharA(test4A));

        // test 5
        System.out.println("Test 5: ");
        sobj.getBinaryCycle();

        // test 6
        char test6A = 'A';
        System.out.println("Test 6: " + sobj.isCharNumber(test6A));

        // test 7
        System.out.println("Test 7: ");
        sobj.getMaxIntValue();

        // test 8
        char test8A = 'A';
        System.out.println("Test 8: " + sobj.getIntFromChar(test8A));

        // test 9
        int test9A = 65;
        System.out.println("Test 8: " + sobj.getCharFromInt(test9A));
    }
}
