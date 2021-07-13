package com.datastructure.loops;


import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Conditionals {
   static void getSign(int num){

        if (num<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
    }

    static  void largest(int a, int b, int c){
       if (a>b && a>c){
           System.out.println(a + " is largest");
       }
       else if (b>a && b>c){
           System.out.println(b + " is largest");
       }
       else{
           System.out.println(c + " is largest");
       }
    }

    static void same(float num1, float num2){
       if (num1==num2){
           System.out.println("Same");
       }
       else{
           System.out.println("Different");
       }
    }

    static void alphabet(char c){
       char  a,e,i,o,u;
       if (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u'){
           System.out.println("vowels");
       }
       else{
           System.out.println("consonents");
       }


    }


    public void odd(int n) {
        int a = 2 * n-1;
            for (int i = 1 ; i <= a ; i++) {

                    if (i % 2 != 0) {
                        System.out.print(i + " ");

                    }

            }
        }

        public void pattern1(int n){
            for (int i = 1; i <= n ; i++) {
                for (int j = 1; j <= i ; j++) {
                    System.out.print(j + " ");
                }
                System.out.println(" ");
            }
        }

        public void pattern2(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(i);
                }
                System.out.println(" ");
            }
        }

        public void pattern3(int n){

/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
        int num = 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <=i ; j++) {
                    System.out.print(num + " ");
                    num +=1;
                }
                System.out.println(" ");
            }
        }
        public void pattern4(int n){

/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i ; j--) {
                    System.out.print(" ");
                }

                for (int k = 1; k<=i  ; k++) {
                    System.out.print(i+ " ");
                }

                for (int j = n; j > i ; j--) {
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        }

        public void pattern5(int n){
/*
   *****
    ****
     ***
      **
       *
 */

            for (int i = n; i >= 0; i--) {
                for (int j = i; j <n ; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k >0 ; k--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }

        public void pattern6(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n ; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("@");
                }
                System.out.println(" ");
            }
        }

      

    public static void main(String[] args)
    {
       Conditionals con = new Conditionals();
//       con.getSign(-1);
//        con.largest(-10,276,3);
//        con.same(25.374f,25.37f);

/*      Scanner scan = new Scanner(System.in);
        String t = scan.next().toLowerCase();
        char s = t.charAt(0);
        con.alphabet(s);
*/
//        con.odd(6);

        con.pattern6(5);


    }
}
