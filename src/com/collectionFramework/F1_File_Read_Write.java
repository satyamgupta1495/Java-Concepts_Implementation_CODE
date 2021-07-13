package com.collectionFramework;

import java.io.BufferedReader;
import java.io.FileReader;

public class F1_File_Read_Write {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Master.txt"));
            String lineContents;
            while ((lineContents = reader.readLine()) !=null){
                System.out.println(lineContents);
                reader.close();
            }
        }
        catch(Exception e){

        }

    }
}
