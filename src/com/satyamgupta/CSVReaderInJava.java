package com.satyamgupta;
import java.io.*;
import java.util.*;

public class CSVReaderInJava {
    public static void main(String[] args) throws IOException {

        String file = "src\\sample.csv";
        String line = "";
        List<ArrayList<String>> list = new ArrayList<>();
        BufferedReader reader = null;
        int sum = 0;
        int x = 1;
        try {
            reader = new BufferedReader(new FileReader(file));
            ArrayList<String> temp = null;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if (x <= 0) {
                    sum += Integer.parseInt(row[8]);
                }
                --x;

                temp = new ArrayList<>();
                temp.add(Arrays.toString(row));
                list.add(temp);
            }
            for (List element : list) {
                System.out.println(element);
            }

            System.out.println("Sum = " + sum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
