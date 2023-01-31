package com.satyamgupta;

import java.io.*;
import java.util.*;
public class FileReadCSV {


    public static void main(String[] args) throws IOException {
        List<String[]> data = readData();
        System.out.println(data);
    }

    public static List<String[]> readData() throws IOException {
        int count = 0;
        String file = "sample.csv";
        List<String[]> content = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        }
        return content;
    }
}
