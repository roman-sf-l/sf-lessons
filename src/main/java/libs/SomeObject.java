package libs;

import java.util.stream.IntStream;

/**
 * SomeObject is a class for test purpose
 */
public class SomeObject {

    /**
     * Return a sum of two digits
     * @param one a first digit
     * @param two a second digit
     * @return a sum of two digits
     */
    public byte sum(byte one, short two){
        return (byte)(one + two);
    }

    /**
     * Return a multiply of two digits
     * @param one a first digit
     * @param two a second digit
     * @return a multiply of two digits
     */
    public long multiply(int one, long two){
        return (long)(one * two);
    }

    /**
     * Return a max value
     * @param one a first value
     * @param two a second value
     * @return a max value of 2 digits
     */
    public int getMaxNumber(int one, int two){
        return (one > two) ? one : two;
    }

    /**
     * Check if char is a 'A' char
     * @param a
     * @return boolean of checking
     */
    public boolean isCharA(char a){
        return (a == 'A');
    }

    /**
     * Print a binary representation of 30 digits
     */
    public void getBinaryCycle(){
        IntStream.range(0, 30).forEach(value -> System.out.println(Integer.toBinaryString(value)));
        //IntStream.range(0, 30).mapToObj(value -> Integer.toBinaryString(value)).forEach(System.out::println);
    }

    /**
     * Check if char is a digit
     * @param value digit for checking
     * @return check result
     */
    public boolean isCharNumber(char value){
        return Character.isDigit(value);
    }

    /**
     * Print MAX_VALUE, MAX_VALUE + 1 of Integer
     */
    public void getMaxIntValue(){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
    }

    /**
     * Get char from a digit
     * @param value int value
     * @return a char
     */
    public char getCharFromInt(int value){
        return (char)value;
    }

    /**
     * Get int from char
     * @param value a char value
     * @return an integer from char
     */
    public int getIntFromChar(char value){
        return (int)value;
    }
}

