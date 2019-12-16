package com.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        System.out.println(v1_task2(130));

        System.out.println(v1_task3(new int[]{1,3,3,4,5}));

    }


    //1,1,3,5
    //3
    public static int v1_task3(int [] ranks) {
        Arrays.sort(ranks);

        //1. сравнить текущий ранг
        int previousRank = ranks[0]; //1
        int soldersInBuffer = 0;
        int totalSolders = 0;

        for (int i = 0; i < ranks.length; i++) {
            if (previousRank == ranks[i]) {
                soldersInBuffer++;
                continue;
            }

            int currentRank = ranks[i];
            //      2                   1
            if (--currentRank == previousRank) {
                totalSolders += soldersInBuffer;
            }
            soldersInBuffer = 1;
            previousRank = ranks[i];
        }
        return totalSolders;
    }


    //123456
    public static int v1_task2(int a) {
        String [] numbers = String.valueOf(a).split("");
        int startIndex = 0;
        int endIndex = numbers.length-1;

        StringBuilder builder = new StringBuilder();
        //0   5
        //1   4
        //2   3
        //3   2
        //------
        //0     2
        //1     1
        while (startIndex <= endIndex) {
            builder.append(numbers[startIndex]);

            if (startIndex != endIndex) {
                builder.append(numbers[endIndex]);
            }


            startIndex++;
            endIndex--;

        }
        return Integer.parseInt(builder.toString());
    }


}
