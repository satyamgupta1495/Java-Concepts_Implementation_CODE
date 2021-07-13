package com.hackerRank;

import java.util.Scanner;
import java.util.StringTokenizer;

public class HackerRank_Q4_StringTokenizer {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            int count = 0;
            System.out.println(HackerRank_Q4_StringTokenizer.num1(s));
            for (String elements: s.split("[,-?. \\'\\!]+"))  {
                count++;
                System.out.println(elements);
            }
            scan.close();
        }
        static int num1(String s){
            int count = 0;
            for (String elements: s.split("[,-?. \\'\\!]+"))  {
                count++;
            }
            return count;
        }
    }
class Solution{
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine().replaceAll("[!,?._'@\\s]+", " ");
    StringTokenizer st = new StringTokenizer(s);
    int count = st.countTokens();
    System.out.println(count);
            for (int i = 0; i < count; i++) {
        System.out.println(st.nextToken());
        }
        scan.close();
        }
}
