package com.hackerRank.problemSolving;

public class StringMultiply {
    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "456";
        System.out.println(multiply(s1,s2));

    }
    static String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0")) return "0";

        int[] res = new int[num1.length() + num2.length()];

        int i = num2.length()-1;
        int pf = 0;

        while(i >= 0){
            int ival = num2.charAt(i)-'0';
            i--;
            int j = num1.length()-1;

            int k = res.length-1-pf;
            int carry = 0;

            while(j >= 0 || carry != 0){
                int jval = j >= 0 ?  num1.charAt(j)-'0' : 0;
                j--;

                int product = ival*jval + carry + res[k];
                res[k] = product%10;
                carry = product / 10;
                k--;
            }
            pf++;
        }

        String str = "";
        boolean flag = false;

        for(int val : res){
            if(val == 0 && !flag) {}
            else {
                flag = true;
                str += val;
            }
        }
        return str;

    }

}
