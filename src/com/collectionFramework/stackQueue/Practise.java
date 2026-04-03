package com.collectionFramework.stackQueue;

public class Practise {

    int[] queue = new int[5];
    int front = 0;
    int rear = 0;
    int size = 0;

    public void enque(int data){

        if(!isFull()){
            queue[rear] = data;
            rear = (rear + 1) % queue.length;
            size++;
        }
    }

    public void deque(){
        if (!isEmpty()){
            front = (front + 1) % queue.length;
            size--;
        }
    }

    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i) % queue.length] + " ");
        }
    }

//    public void show()
//    {
//        for (int i = 0; i < size; i++) {
//            System.out.print(queue[(front+i) % queue.length] + " ");
//        }
//    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public boolean isFull(){
        return getSize() == queue.length;
    }

    public int getSize(){ return size;}

    public static void main(String[] args) {
        Practise q = new Practise();
        q.enque(14);
        q.enque(5);
        q.enque(20);
        q.enque(80);
        q.enque(20);
//        q.enque(80);
//        q.enque(05);
//        q.enque(20);
//        q.enque(80);
//        q.enque(20);
//        q.enque(80);



//        q.deque();
        q.deque();

        System.out.println("is empty = " + q.isEmpty());
        System.out.println("is full = " + q.isFull());
        System.out.println("Size = " + q.getSize());
        q.show();
    }

}
