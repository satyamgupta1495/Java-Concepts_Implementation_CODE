package com.satyamgupta;

import java.util.ArrayList;

public class SwitchCase {
    public static void main(String[] args) {

        ArrayList<Long> list = new ArrayList<>();
        int a = 10;
        list.add((long)a);

        int day = 2;
        String todayDay;
        switch (day){
            case 1:
                todayDay = "Monday";
                break;

            case 2:
                todayDay = "Tuesday";
                break;

            case 3:
                todayDay = "Wednesday";
                break;
            default:
                todayDay = "Not valid day!";
                break;
        }
        System.out.println(todayDay);
    }
}
