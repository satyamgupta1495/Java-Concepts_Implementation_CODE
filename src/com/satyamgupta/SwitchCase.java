package com.satyamgupta;

public class SwitchCase {
    public static void main(String[] args) {
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
