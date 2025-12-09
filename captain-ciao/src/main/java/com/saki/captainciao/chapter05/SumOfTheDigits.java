package com.saki.captainciao.chapter05;

public class SumOfTheDigits {
    public static void main(String[] args) {

        System.out.println(digitSum(13565L));
        System.out.println(digitSum(2467L));
        System.out.println(digitSum(579L));
        System.out.println(digitSum(22L));
        System.out.println(digitSum(1L));
        System.out.println(digitSum(0L));

        /*from here more easy method*/
        System.out.println("-------- from here more easy method -------");
        System.out.println(digitSum("12345"));
        System.out.println(digitSum("1234d5"));

    }

    /**
     *
     * @param valueOfLongNumber entered number
     * @return the sum of digits
     */
    public static int digitSum(long valueOfLongNumber) {
        int lengthOfUsedDigits = determineNumberOfDigits(valueOfLongNumber);
        int sumResult = 0;
        //
        if (lengthOfUsedDigits == 0) {
            return 0;
        } else if (lengthOfUsedDigits == 1) {
            return (int) valueOfLongNumber;
        } else if (lengthOfUsedDigits > 1) {
            long[] singleDigitArray = new long[lengthOfUsedDigits];

            long tempArrayInput;
            long expFactor;
            // fill the array recursive divided by 10 exp i
            for (int i = 0; i < lengthOfUsedDigits; i++) {
                expFactor = (long) Math.pow(10, i);
                tempArrayInput = valueOfLongNumber / expFactor;
                singleDigitArray[i] = tempArrayInput;
            }

            //reduce the array amounts of each array-field and reduce to the concrete digit
            long tempArrayPositionMemory;
            long nextArrayPosition;
            for (int j = 0; j < lengthOfUsedDigits - 1; j++) {
                tempArrayPositionMemory = singleDigitArray[j];
                nextArrayPosition = singleDigitArray[j + 1];
                singleDigitArray[j] = tempArrayPositionMemory - nextArrayPosition * 10;
            }

            // add all digits
            for (int k = 0; k < lengthOfUsedDigits; k++) {
                sumResult += (int) singleDigitArray[k];
                System.out.print(singleDigitArray[k] + (k < lengthOfUsedDigits - 1 ? " + " : "= "));
                if (k >= lengthOfUsedDigits - 1) {
                    System.out.println(sumResult);
                }
            }
            System.out.println();
        }
        return sumResult;
    }

    public static int digitSum(String value) {
        int result = 0;
        char[] charArray = value.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                result += Character.getNumericValue(c);
            } else {
                throw new IllegalArgumentException("The character must be a digit!");
            }
        }
        return result;
    }

    /**
     *
     * @param valueInputOfLongNumber the number entered to count the digits
     * @return the amount of the digits of a number
     */
    public static int determineNumberOfDigits(long valueInputOfLongNumber) {
        int amountOfNumbers = 0;
        long copyOfValue = valueInputOfLongNumber;
        while (copyOfValue >= 1) {
            copyOfValue /= 10;
            amountOfNumbers += 1;
        }
        return amountOfNumbers;
    }

//    public static int[] storeEachDigit()
//
}
