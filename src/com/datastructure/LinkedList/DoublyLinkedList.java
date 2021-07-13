package com.datastructure.LinkedList;

public class DoublyLinkedList
{
    Node head;
    Node tail;

    static class Node
    {
        int data;
        Node previous = null;
        Node next = null;
    }
    public void insertAtEnd(int data)
    {
        Node new_node  = new Node();
        new_node.data = data;

        Node n = head;
        if (head == null && tail == null){
            head = new_node;
            tail = new_node;
        }
        else{
            while (n.next!=null){
                n = n.next;
            }
            new_node.previous = tail;
            n.next = new_node;
            tail = new_node;

        }
    }

    public void insertAtFront(int data){
        Node new_node  = new Node();
        new_node.data = data;

        head.previous = new_node;
        new_node.next = head;
        head = new_node;
    }

    public void insertAtAnyLocation(int data, int index){
        Node new_node  = new Node();
        new_node.data = data;

        Node n = head;

        if (head == null){
            System.out.println("No list found");
            return;
        }
        else if (index == 0){
            head.previous = new_node;
            new_node.next = head;
            head = new_node;
        }
        else if (index < 0){
            System.out.println("No index found");
            return;

        }
        else{
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            new_node.next = n.next;
            new_node.previous = n.next;
            n.next = new_node;
        }


    }

    public void deleteFromEnd()
    {
        Node n = head;
        Node p = tail;
        if (head == null)
            return;
        else if(head == tail){
            head = null;
            tail = null;
        }
        else{
            while(n.next.next != null){
                n = n.next;
            }

            n.next = null;
            tail = n.next;
        }

    }

    public void deleteFromFront()
    {
        Node n = head;
        if (head == null)
            return;
        else if (head == tail){
            head = null;
            tail = null;
        }
        else{
            Node temp =  n.next;
            temp.previous = null;
            head = temp;
            n.next = null;
        }
    }

    public void deleteFromAnyLocation(int index){

        Node n = head;

        if (index == 0){
            Node temp =  n.next;
            temp.previous = null;
            head = temp;
            n.next = null;
        }
        else{
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            Node temp = n.next.next;
            n.next = temp;
            n.previous = n;
        }


    }

    public void showData(){

        Node n = head;

        while(n != null){
            System.out.println(n.data);
            tail = n;
            n = n.next;

        }


    }

    public static void main(String[] args)
    {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(200);
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

//        list.showData();
//        System.out.println("---------------------");

//        list.insertAtFront(11111);
//        list.showData();

//        list.insertAtAnyLocation(1111, -1);
        list.showData();

        System.out.println("---------------------");
//        list.deleteFromEnd();
//        list.showData();

//        list.deleteFromFront();
//        list.showData();

        list.deleteFromAnyLocation(3);
        list.showData();

    }
}
