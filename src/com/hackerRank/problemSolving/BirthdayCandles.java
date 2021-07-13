package com.hackerRank.problemSolving;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BirthdayCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int max=Integer.MIN_VALUE, count=0;
        for(int i = 1; i<candles.size(); i++){


            if(max < candles.get(i)){
                max = candles.get(i);

            }

            if(max==candles.get(i) ){
                count++;
            }

        }
        return count;
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,0);


        BirthdayCandles candle = new BirthdayCandles();
        System.out.println(candle.birthdayCakeCandles(list));

    }

}
