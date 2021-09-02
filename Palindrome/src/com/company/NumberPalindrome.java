package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if (number <0) {
            number=-1*number;
        }

        int tempNumber=number;
        int count =number;
        int digitNumber=0;
        int lastDigit=0;
        int reverse=0;
        int reverseDigit=1;

        while (tempNumber > 0) {
            tempNumber= tempNumber / 10;
            digitNumber++;
        }

        while (count > 0){
           lastDigit =count % 10;
           count= count / 10;
           for (int i=0;i<(digitNumber-1);i++){
               reverseDigit=10*reverseDigit;

           }

           reverse=reverse+(reverseDigit*lastDigit);
           reverseDigit=1;
           digitNumber--;


        }
        if (number == reverse){
            return true;
        } else{
            return false;
        }
    }



}
