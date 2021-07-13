package com.satyamgupta;

import java.io.*;
import java.util.Scanner;

public class File_Handling {
    public static void main(String[] args) {

        //! Creating new file.
//       try{
//        File myFile = new File("newFile.txt");
//        myFile.createNewFile();
//           System.out.println("File created successfully!");}
//       catch (Exception e) {
//           System.out.println("unable to create a file!");
//           System.out.println(e.getMessage());
//       }

        //! Reading a file.
//        try {
//            FileReader reader = new FileReader("newFile.txt");
//            Scanner sc = new Scanner(reader);
//            while(sc.hasNextLine()){
//                String line  = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException ea) {
//            ea.printStackTrace();
//        }

           //! Writing into new file.
//        try {
//            FileWriter myFilewriter = new FileWriter("newFile.txt");
//            myFilewriter.write("This is the first line of the new file!\nNIKAL LE BHAI!");
//            myFilewriter.close();
//        } catch (IOException eb) {
//            eb.printStackTrace();
//        }

        //! Deleting a file.

//        File myFile = new File("newFile.txt");
//        if (myFile.delete()){
//            System.out.println("I have deleted "+ myFile.getName());
//
//        }
//        else{
//            System.out.println("An error occured!");
//        }

        //! Replacing some text in an file.

        try {
            FileReader reader =  new FileReader("newFile.txt");
            Scanner scan = new Scanner(reader);
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);

            }
            try {
                FileWriter writer = new FileWriter("newFile.txt");

            } catch (IOException e) {
                e.printStackTrace();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    }

