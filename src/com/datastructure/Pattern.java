package com.datastructure;

public class Pattern {
    public static void main(String[] args) {
        pattern0(5);
    }
    static void pattern18(int n){
        int og = n;
        n = 2*n;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                int everyIndex = og -  Math.min(Math.min(row, col), Math.min((n-row),(n-col)));
                System.out.print(everyIndex);
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for (int row = 1; row <= 2 *n; row++) {
            int totalCol = row > n ? 2 * n-row : row;

            for (int spaces = 0; spaces < n-totalCol; spaces++) {
                System.out.print("  ");
            }

            for (int col = totalCol; col >= 1 ; col--) {
                System.out.print(col +  " ");
            }

            for (int col = 2; col <= totalCol; col++) {
                System.out.print(col + " ");
            }


            System.out.println();
        }
    }

    static void pattern5(int n){
        for (int row = 1; row <= n; row++) {
            for (int s = 0; s < row-1; s++) {
                System.out.print("-");
            }

            for (int col = row; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern4(int n){
        String string = "*";
        for (int row = 1; row <= n ; row++) {
            for (int col = 0; col < n-row+1; col++) {
                System.out.print(string);
            }

            for (int s = 0; s < row-1; s++) {
                System.out.print("  ");
            }

            for (int col = row; col <= n; col++) {
                System.out.print(string);
            }
            System.out.println();
        }
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(string);
            }
//
            int space = n-row+1;
            for (int s = 1; s < space; s++) {
                System.out.print("  ");
            }

            for (int col = 1; col <= n-n+row; col++) {
                System.out.print(string);
            }

            System.out.println();
        }
    }

    static void pattern3(int n){
        for (int row = 1; row <= 2*n ; row++) {
            int totalCol = row > n ? 2 * n - row : row;

            int spaces = n-totalCol;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= totalCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int row = 1; row <= 2*n ; row++) {
            int totalCol = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalCol ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern0(int n){
        int count = n;
        int ans = 0;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if(count!= 0){
                    System.out.print("$");
                    if (col == row){
                        ans++;
                    }
                    count--;

                }
            }
            System.out.println();
        }
        System.out.println("ans -> " + ans );
    }
}
