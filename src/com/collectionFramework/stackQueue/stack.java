package com.collectionFramework.stackQueue;

public class stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
        stack[top] = data;
        top++;
    }
    public void pop(){
        top--;
        stack[top] = 0;
    }

    public void peek(){
        System.out.println(stack[top-1]);
    }

    public void show(){
        for (int elem:stack  ) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        stack st = new stack();

        st.push(12);
        st.push(87);
        st.push(48);

//        st.show();
//        st.pop();
        st.pop();

        st.show();
        System .out.println("--------");

        st.peek();
    }
}
