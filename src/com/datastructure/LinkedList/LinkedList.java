package com.datastructure.LinkedList;

public class LinkedList{

    Node head;
    static class Node
    {
        int data;
        Node next = null;
    }

    static Node getNode(int data)
    {
        Node new_Node = new Node();
        new_Node.data = data;
        new_Node.next = null;

        return new_Node;
    }

    public void insertAtEnd(int data)
    {
        Node new_Node  = getNode(data);
        System.out.println(new_Node);
        Node n = head;

        if (head == null) {
            head = new_Node;
        }
        else{

            while(n.next!=null){
                n = n.next;
            }

            n.next = new_Node;
        }
    }

    public void insertAtFront(int data){

        Node new_Node = new Node();
        new_Node.data = data;


        if (head == null) {
            head = new_Node;
        }
        else{
            new_Node.next = head;
            head = new_Node;
        }

    }

    public void insertAtAnyLocation(int data, int index)
    {
        Node new_Node = getNode(data);

        Node n = head;

        if (index==0) {

            new_Node.next = head;
            head = new_Node;

        }

        else {

            for (int i = 0; i<index-1 ; i++ ) {
                n = n.next;
            }

            new_Node.next = n.next;
            n.next = new_Node;


        }
    }

    public void deleteFromFront(){

        Node n = head;

        if (n == null){
            head = null;
        }
        else  {

            head = n.next;
            n.next = null;
        }

    }

    public void deleteFromEnd() {

        Node n = head;

        if (head == null){
            head = null;
        }
        else if (n.next == null){
            head = null;
        }
        else if (n.next.next == null){
            while (n.next.next != null) {
                n = n.next;
            }

            n.next = null;

        }
    }
    public void deleteFromAnyLocation(int index){

        Node n = head;

        if (index == 0) {
            head = n.next;
            n.next = null;
        }

        else{

            for (int i = 0; n!=null && i<index-1 ; i++ ) {
                n = n.next;
            }

            Node temp = n.next.next;
            n.next = temp;

        }
    }


    public void showData() {

        Node n = head;

        if (head == null)
            return;
        else {
            while (n.next != null) {

                System.out.println(n.data);
                n = n.next;

            }

            System.out.println(n.data);
        }

    }
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        //Inserting data into Linked List.

        list.insertAtEnd(10);
//        list.insertAtEnd(20);
//        list.insertAtEnd(30);
//        list.insertAtEnd(40);
//        list.insertAtEnd(50);
//        list.insertAtEnd(60);
//        list.insertAtEnd(100);

//        list.showData();

        // System.out.println("Data Inserted at the End!");
        // System.out.println("\n-------------------\n");

        // list.insertAtFront(01);

        // list.showData();
        // System.out.println("Data Inserted at the Front!\n");
//        System.out.println("\n-------------------\n");

        // list.insertAtAnyLocation(11111, 5);
        // list.insertAtAnyLocation(222222, 7);
        // list.showData();
        // System.out.println("Data Inserted at at the given Location");

//         list.deleteFromFront();
         list.showData();

         System.out.println("\n-------------------\n");

         list.deleteFromEnd();
        // list.showData();

//        list.deleteFromAnyLocation(7);
//        list.showData();

//        list.insertAtEnd(10);
//        System.out.println("\n-------------------\n");
//        list.showData();


    }
}