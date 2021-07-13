package com.collectionFramework.stackQueue;

public class Queue {

    int[] queue = new int[5];
    int size;
    int front = 0;
    int rear = 0; 
    
    public void enque(int data)
    {
        if (!isFull()) {
            queue[rear] = data;
            rear = (rear + 1) % 5;  //! 5 -> Size of array
            size++;
        }
        else{
            System.out.println("Queue is FULL");
        }
    }
    
    public void show()
    {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front+i)%5] + " ");
        }
    }

    public void deque()
    {
        if (!isEmpty()) {
            front = (front + 1) % 5;
            size--;
        }
        else{
            System.out.println("Queue is Empty");
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return  getSize()==0;
    }

    public boolean isFull(){
        return getSize()==5;
    }


    public static void main(String[] args) {

        Queue q = new Queue();
//        q.enque(14);
//        q.enque(05);
//        q.enque(20);
//        q.enque(80);
//        q.enque(20);
//        q.enque(80);
//        q.enque(05);
//        q.enque(20);
//        q.enque(80);
//        q.enque(20);
//        q.enque(80);



//        q.deque();
        q.deque();

//        System.out.println("is empty = " + q.isEmpty());
//        System.out.println("is full = " + q.isFull());
        System.out.println("Size = " + q.getSize());
        q.show();

    }
}
