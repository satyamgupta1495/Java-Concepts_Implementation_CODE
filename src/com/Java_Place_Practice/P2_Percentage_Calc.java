package com.Java_Place_Practice;

class MarksCalc{
    float m;
    float s;
    float h;
    float c;
    float g;

    MarksCalc(float maths,float science,float history,float computer,float geography){

        this.c = computer;
        this.h = history;
        this.s = science;
        this.m = maths;
        this.g = geography;

    }

    public float percentage(){
        float result = (m+h+g+c+s)/500*100;
        return result;
    }
}

public class P2_Percentage_Calc {
    public static void main(String[] args) {
        MarksCalc m = new MarksCalc(72f,88f,77f,99f,77f);
        float f = m.percentage();
        System.out.println(f);
    }
}
