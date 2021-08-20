package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivision(9,30));

    }
    public static int getGreatestCommonDivision(int first,int second){
            int min =first;
            int commonDivision =0;
			//testing git branch testing
			//hello from testing 2
            if(first < 10 || second < 10){
                return -1;

            }
            if (first > second) {
                min=second;
            }

        for (int i = min; i > 0; i--) {

            if((first % i==0) &&(second % i==0)){
                commonDivision = i;
                break;
            }

        }
        return commonDivision;



    }



}
