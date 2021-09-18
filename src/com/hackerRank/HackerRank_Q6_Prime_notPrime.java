package com.hackerRank;

import java.util.Scanner;

public class HackerRank_Q6_Prime_notPrime {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            boolean ans = primeOrNot(a);
            System.out.println(ans);
        }

        static boolean primeOrNot(int n)
        {
            if ( n <= 1)
                return false;

            int c = 2;
            while( c * c <= n)
            {
                if ( n % c == 0)
                    return false;
                c++;
                System.out.println(c);
            }

            if ( c * c > n)
            {
                return true;
            }

            return false;
        }


}
