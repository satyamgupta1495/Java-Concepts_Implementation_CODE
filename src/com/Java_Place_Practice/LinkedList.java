package com.Java_Place_Practice;
public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next = null;
    }

    public void insert(int data){
        Node new_node = new Node();
        new_node.data = data;
        new_node.next = null;

        if (head==null){
            head = new_node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = new_node;
        }
    }

    public void show(){
        Node tempNode = head;
        while (tempNode.next!=null){
            System.out.println(tempNode.data);
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);
    }

    public void printMiddle(){
        Node slow_ptr = head;
        Node fast_ptr = head;

        if (head!=null){
            while (fast_ptr !=null && fast_ptr.next!=null){
                slow_ptr = slow_ptr.next;
                fast_ptr = fast_ptr.next.next;
            }
            System.out.println("Middle element is : " + slow_ptr.data);
        }
    }

    public void deleteNode(int index){
        if (head==null)
            return;
        Node n = head;

        if (index==0){
            head = n.next;
            return;
        }

        for (int i = 0; n!=null && i < index-1; i++) {
            n = n.next;
        }

        if (n ==null || n.next == null)
            return;

        Node next = n.next.next;
        n.next = next;



    }



    public static void main(String[] args) {
        LinkedList t = new LinkedList();

        t.insert(11);
        t.insert(12);
        t.insert(13);
        t.insert(14);
        t.insert(15);



        t.show();
////        t.printMiddle();
//        t.getDecimalValue();
        t.deleteNode(2);
        t.show();


    }
}
