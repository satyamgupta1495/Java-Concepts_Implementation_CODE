package com.datastructure.loops;

public class Test_annotation {


    public static void main(String[] args) {

        /*  *
         **
         ***
         ****
         */

//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        /*       *
         * * *
         * * * * *
         * * *
         *
         */

/*        int n = 7;

        //! No. of stars in each row.
//?        for (int i = 1; i < n ; i=i+2) {
        for (int i = 1; i < n ; i++) {

            //! Printing empty spaces.
            for (int j = n-i; j > 0 ; j--) {
                System.out.print(" ");
            }

            //! Printing the actual stars.
            for (int k = i; k > 0 ; k--) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

//?        for (int i = n-3; i >= 0  ; i=i-2) {
        for (int i = n-3; i >= 0  ; i--) {
            for (int j = i+1; j <= n ; j++) {
                System.out.print(" ");
            }

            for (int k = i; k > 0 ; k--) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }

*/

/*
1010101
 10101
  101
   1
*/
//        int depth = 4;
//        for (int i = depth; i > 0 ; i--) {
//            for (int j = depth; j>i ; j--) {
//                System.out.print(" ");
//            }
//            for (int k = i; k > 0 ; k--) {
//                System.out.print("1");
//                System.out.print("0");
//            }
//
//            System.out.println(" ");
//        }


/*
   1
  1 2
 1 2 3
1 2 3 4

 */

 /*       int depth = 4;

        for (int i = 1; i <= depth ; i++) {
            for (int j = depth; j>i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(k + " ");

            }
            System.out.println(" ");
        }
*/


// Factorial of a number

//        int num = 5;
//        int fact = 1;
//        for (int i = 1; i<=num; i++) {
//            fact = fact *i;
//
//        }
//        System.out.println(fact);



/*
 *
 **
 * *
 *  *
 *   *
 *    *
 *     *
 *      *
 *       *
 **********
 */
        int depth = 10;
        for (int i = 1; i <=depth ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i==depth || j==i || j == 1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }



    }
}