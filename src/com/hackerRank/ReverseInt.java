package com.hackerRank;
public class ReverseInt {
    public int reverse(int num) {

        int reverse = 0;
        int remainder = 0;

        while(num!=0)
        {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;

            if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE)
                return 0;
        }

        return reverse;

    }

    public static void main(String[] args) {
        ReverseInt rev = new ReverseInt();
        System.out.println(rev.reverse(541554554));

    }
}
