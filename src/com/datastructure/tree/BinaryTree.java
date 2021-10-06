package com.datastructure.tree;

import java.util.*;

public class BinaryTree {

    static Scanner scan = null;
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        scan = new Scanner(System.in);
        Node root = createtree();
        System.out.println(list);
    }

    static Node createtree(){


        System.out.println("Enter data: ");
        int data = scan.nextInt();

        if (data == -1) return null;

        Node root = new Node(data);

        System.out.println("Enter Left for : " + data);
        root.left = createtree();

        System.out.println("Enter Right for : " + data);
        root.right = createtree();


        list.add(root.data);

        return root;
    }
}
class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
        }
    }

