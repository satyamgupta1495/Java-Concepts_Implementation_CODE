package com.datastructure;

import java.util.Arrays;

public class GCD_LCM {
    public static void main(String[] args) {
        Long A = 5L;
        Long B = 10L;
        Long[] ans = new Long[2];
        ans[0] = lcm(A,B);
        ans[1] = gcd(A,B);

        System.out.println(Arrays.toString(ans));
    }

    static Long lcm(Long a, Long b){
        System.out.println(a*b/gcd(a,b));
        return a*b/gcd(a,b);
    }

    static Long gcd(Long a , Long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }

}
