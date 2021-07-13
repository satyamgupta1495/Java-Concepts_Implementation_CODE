package com.datastructure.LinkedList;

import java.util.LinkedList;




public class CollectionsLinkedList
{
    Node head;
    class Node{
        int data;
        Node next = null;
    }

    void insert(int data){
        Node n = head;
        Node new_node = new Node();
        new_node.data = data;

        if (head == null)
            head = new_node;
        else{
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = new_node;

        }

    }

    void print(Node head){
        Node n = head;
         while(n!=null)
         {
             System.out.println(n.data);
             n = n.next;
         }
    }

    public static void main(String[] args) {

 //! Own implemeted Linked List
/*
        CollectionsLinkedList list2 = new CollectionsLinkedList();
        list2.insert(11);
        list2.insert(33);
        list2.insert(22);
        list2.insert(99);

        list2.print(list2.head);
*/
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(90);

        System.out.println(list);
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(110);
        list3.add(220);
        list3.add(320);
        list3.add(420);
        list3.add(920);


        System.out.println("After adding more elements");

        list.addAll(3,list3);

        System.out.println(list);




    }
}
