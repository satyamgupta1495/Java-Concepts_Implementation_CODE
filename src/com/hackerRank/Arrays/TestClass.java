package com.hackerRank.Arrays;

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {

    static int[] rotate(int[] array, int k){

                int temp = array[array.length-1];
                if (k != 0)
                for (int i = array.length-1; i > 0 ; i--) {
                    array[i] = array[i-1];

                }
                array[0] = temp;


            return array;
        }

    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();

        int[] arr = new int[N];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
        }

        rotate(arr,K);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
