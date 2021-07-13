package com.hackerRank.LinkedList;

import java.util.HashSet;

public class Reverse_LinkedList {

    private static Node head;


    static class Node
    {
        int data;
        Node next = null;
    }

    public Node getNode(int data)
    {
        Node new_node = new Node();
        new_node.data = data;
        return new_node;
    }

    public Node insertatEnd(int data)
    {
        Node new_Node = getNode(data);
        Node n = head;

        if (head == null)
            head = new_Node;
        else
        {
            while(n.next!=null)
            {
              n = n.next;
            }
            n.next = new_Node;
        }
        return new_Node;
    }

    public void printList()
    {
        if (head == null) return;
        Node n = head;
        while (n.next!=null){
            System.out.print(n.data + " ");
            n = n.next;

        }
        System.out.print(n.data + " ");
    }

    public Node reverseLinkedList(Node head){

       if (head == null) return null ;

       Node prev_node = null;
       Node current_node = head;

       while(current_node !=null){
           Node next_node = current_node.next;
           current_node.next = prev_node;
           prev_node = current_node;
           current_node = next_node;
       }
        return prev_node;


    }

    public Node reverseSegmentedLinkedList(Node head, int segment)
    {
        if(head == null)
            return null;

        Node next = null;
        Node prev = null;
        Node current = head;
        int count = 0;

        while(current != null && count < segment){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if (next!=null){
            head.next = reverseSegmentedLinkedList(next,segment);
        }
            return  prev;
    }

    public static boolean detectLoop(Node head){
        HashSet<Node> set = new HashSet<>();
        while(head!=null){

            if(set.contains(head))
                return true;

            set.add(head);
            head = head.next;
        }
        return false;
    }

    public Node removeDuplicateSorted()
    {
        Node curr = head;

        while(curr != null)
        {
            Node next = curr.next;
            while(next!=null && next.data == curr.data)
            {
                next = next.next;
            }
            curr.next = next;
            curr = curr.next;
        }
        return curr;

    }


    public Node remove(){
        Node curr = head;

        while(curr!=null)
        {
            Node next = curr.next;
            while(next != null && next.data == curr.data)
            {
                next = next.next;
            }
            curr.next = next;
            curr = curr.next;
        }
        return curr;

    }


    public Node removeUnsorted()
    {
        Node curr = head;
        HashSet<Node> hashList = new HashSet<>();
        while(curr!=null)
        {
            Node next = curr.next;
            hashList.add(curr);
            while(next !=null)
            {
                for (int i = 0; i < hashList.size(); i++) {
                    if (hashList.contains(curr) && next.data == curr.data)
                    {
                        next = next.next;
                    }
                }
                next = next.next;
            }
            curr.next = next;
           curr = curr.next;
        }
        return  curr;
    }

    public static void main(String[] args) {
        Reverse_LinkedList list = new Reverse_LinkedList();
        list.insertatEnd(1);
        list.insertatEnd(4);
        list.insertatEnd(5);
        list.insertatEnd(7);
        list.insertatEnd(8);
        list.insertatEnd(2);
        list.insertatEnd(3);
        list.insertatEnd(3);
        list.insertatEnd(7);

//        list.printList();

//        System.out.println();

//        list.head = list.reverseLinkedList(list.head);
//        list.printList();
//
//        System.out.println();
//
//        list.head = list.reverseSegmentedLinkedList(list.head, 6);
//        list.printList();

//        boolean b =  detectLoop(list.head);
//        System.out.println("List containe loop -> " + b);


//       list.removeDuplicateSorted();

//        list.printList();

//        System.out.println();

        list.removeUnsorted();
        list.printList();
        System.out.println("No duplicates");










    }
}
