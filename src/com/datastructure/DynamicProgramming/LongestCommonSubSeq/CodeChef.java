package com.datastructure.DynamicProgramming.LongestCommonSubSeq;

import java.util.*;

public class CodeChef {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();
        StringBuilder sb1 = new StringBuilder(n);
        StringBuilder sb2 = new StringBuilder(n);
        sb1.append(scan.next());
        sb2.append(scan.next());

        System.out.println(n  + " " + k + " " + sb1 + " " + sb2);

        String lcs = getLCS(sb1.toString(),sb2.toString(),n,k);

//        System.out.println(lcs);
        if (lcs.length() < k) {
            System.out.println("-1");
        }
        else {
            PriorityQueue<Character> pq = new PriorityQueue<>();
            for (int i = 0; i < lcs.length(); i++) {
                pq.add(lcs.charAt(i));
                if (pq.size() > k){
                    pq.poll();
                }
            }
            System.out.println(pq.poll());
        }

    }

    static String getLCS(String s1, String s2, int n, int m){
        int[][] dp = new int[n+1][m+1];
        int max = 0;

        for(int i = 0; i<= n; ++i){
            for(int j = 0; j <= m; ++j){
                if(i == 0) dp[i][j] = 0;
                if(j == 0) dp[i][j] = 0;
            }
        }

        for(int i = 1; i<= n; ++i){
            for(int j = 1; j <= m; ++j){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1+ dp[i-1][j-1];

                }
                else{
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <= m ; j++) {
                max = Math.max(max, dp[i][j]);

            }
        }
        for(int[] val : dp){
            System.out.println(Arrays.toString(val));
        }

        //!Printing the SubString
        StringBuilder sb = new StringBuilder();

        int i = n, j = m;
        while(i > 0 && j > 0){
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            } else {
                if (dp[i-1][j] > dp[i][j-1]){
                    i--;
                }else{
                    j--;
                }
            }
        }

        System.out.println(sb);

        return sb.toString();

    }




}
