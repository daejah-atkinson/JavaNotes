package one;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;
        Date now = new Date();
        String message = "Hello World" + "!!";
        //arrays single dimensional
        int[] numbers = {2,3,5,1,4};
        Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        // System.out.println(numbers.length);

        //multidimensional arrays
        int[][] newNumbers = new int[2][3];
        newNumbers[0][0]=1;
        //curly brace syntax
        //int[][] number = {{1,2,4},{4,5,6}}

        // System.out.println(Arrays.deepToString(newNumbers));
        // System.out.println(now);
        // System.out.println(age);
        // System.out.println(viewsCount);
        // System.out.println(price);
        // System.out.println(letter);
        // System.out.println(isEligible);
        // System.out.println(message);

        //constant - final marks as constant, use all caps to name constant variables
        final float PI = 3.14F;

        //divison - in JAVA divsion on a whole number always results in a whole number, if you want a decimal (float) you have to change the numbers to
        // a double or a float;
        double result = (double)10/ (double)3;
        // System.out.println(result);

        //implicit casting
        //byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;

        //for string to integer
        //String x = '1';
        //int y = Integer.parseInt(x) + 2
        //FOR DOUBLE
        //String x = '1.1'
        //double y = Double.parseDouble(x) + 2

        double resultTwo = Math.ceil(1.1F);
        int resultThree = Math.round(1.1F);
        int resultFour = (int)Math.floor(1.1F);
        int resultFive = Math.max(1,2);
        int resultSix = Math.min(1, 2);
        int resultSeven = (int)(Math.random() * 100);

        //FORMAT NUMBERS
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String newResult = currency.format(1234567.891);
        // System.out.println(newResult);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String newResultTwo = percent.format(0.1);
        // System.out.println(newResultTwo);


        

        
    }
}
