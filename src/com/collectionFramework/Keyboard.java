package com.collectionFramework;

import java.io.IOException;

public class Keyboard {
    public static void main(String[] args) {

        //! Program 1
//        JFrame frame = new JFrame();
//        String temp;
//        temp = JOptionPane.showInputDialog(null,"Guess the Number");
//        int i = Integer.parseInt(temp);
//        System.out.println(i < 0 ? "True" : "False");
//        frame.setLayout(null);
//        frame.setBounds(500,500,500,500);
//        frame.setVisible(true);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//


        //!Program 2
        try {
            Stop.stopProgram();
        }
        catch (Exception e){

        }
    }
}

class Stop  {
    public static void stopProgram() throws IOException {

        for (int j = 0; (char) System.in.read()!= 'S';) {
            System.out.println("Pass# : " + j);
            j++;
        }


    }
}