package com.saki.captainciao.chapter05;

import java.util.Arrays;

/**
 * chapter 5.3
 */
public class UnaryCoding {

    public static void main(String[] args) {

        System.out.println(encode(0, 1, 2, 3, 0, 1));//        ode( 0, 1, 2, 3, 0, 1 ) → "0101101110010"
        System.out.println(encode( 0, 0, 0, 0 ));
        System.out.println(encode());
        System.out.println(Arrays.toString( decode("0101101110010") ));// → [0, 1, 2, 3, 0, 1]


    }

    private static String encode(int... values) {

        String printOne = "1";
        String printZero = "0";

        StringBuilder sb = new StringBuilder();
        if (values.length < 1) {
            return "";
        } else {
            for (int value : values) {

                for (int j = 0; j < value; j++) {
                    sb.append(printOne);
                }
                sb.append(printZero);
            }
        }

        return sb.toString();
    }

    private static int[] decode(String value) {
        char[] charArray = value.toCharArray();
        int countMaxArrayLength =0;

        // detect how many digits = array.length
        for (char c: charArray) {
            if (c == '0'){
                countMaxArrayLength +=1;
            }
        }

        int[] result = new int[countMaxArrayLength];
        int resultIndexCounter = 0;

        int digitValueCounter = 0;
        // fill the array
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == '1') {
                digitValueCounter +=1;
            } else {
                result[resultIndexCounter] = digitValueCounter;
                resultIndexCounter +=1;
                digitValueCounter = 0;
            }


        }
        return result;
    }

}
