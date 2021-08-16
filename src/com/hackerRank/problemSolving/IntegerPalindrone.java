package com.hackerRank.problemSolving;

public class IntegerPalindrone {

    boolean isPalindrone(int x){

        int num = Math.abs(x);
        System.out.println(num);
        int reverse = 0;
        while(num!=0)
        {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        System.out.println("num -> " + x);
        System.out.println("reverse -> " + reverse);

        if(Math.abs(x) == reverse)
        {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        IntegerPalindrone p = new IntegerPalindrone();
        System.out.println(p.isPalindrone(-121));
    }
}
