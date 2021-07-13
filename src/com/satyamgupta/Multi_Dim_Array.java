package com.satyamgupta;

public class Multi_Dim_Array {
    //Arrays of Arrays are called as multidimensional array
    public static void main(String[] args) {
//        int[][] flat = {{9,4,9,2,6,4},{1,8,6,24,5,2}};
//
//
//        for (int i = 0; i<flat.length; i++){
//            for (int j= 0; j<flat[i].length;j++){
//                System.out.print(flat[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }

//        String [][] cars = {{"Ferrari", "Lamborghini","Renault", "Skoda"},{"100,000$","300,000$","1000$","45000$"}};
//
//        for (int i = 0; i< cars.length; i++){
//            for (int j = 0; j<cars[i].length; j++){
//                System.out.print(cars[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

        String[] car = {"Ferrari", "Lamborghini","Renault", "Skoda"};
//        for (int i =car.length-1;i>=0;i--)
//        {
//            System.out.println(car[i]);
//        }

        for (String elements:car ) {
            System.out.println(elements);
        }



    }




}
