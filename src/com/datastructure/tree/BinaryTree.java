package com.datastructure.tree;

import java.util.Scanner;

public class BinaryTree {

    static Scanner s = null;
    public static void main(String[] args) {
        s = new Scanner(System.in);

    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter data : ");
        int data = s.nextInt();

        if (data == -1) return null;

        root = new Node(data);

        return root;
    }

    static class Node{
        Node left, right;
        int data;

        public Node(int data){
            this.data = data;
        }
    }

}
