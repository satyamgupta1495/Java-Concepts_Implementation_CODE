package com.datastructure.Heap;

import java.util.ArrayList;

class Heap<T extends Comparable<T>> {

    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int getParent(int index){
        return (index) / 2;
    }

    private int getLeft(int index){
        return (index) * 2 + 1;
    }

    private int getRight(int index){
        return (index) * 2 + 2;
    }

    public void insert(T value){

        //1st insert at the last
        list.add(value);

        upHeap(list.size()-1);
    }

    private void upHeap(int index) {
        if(index == 0) return;
        int p = getParent(index);

        // if current element [last] is less than parent --> swap
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upHeap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()) {
            throw new Exception("Removing from empty array!");
        }

        //remove from top of the tree
        T temp = list.get(0);

        T last = list.remove(list.size()-1);

        if(!list.isEmpty()){
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        int min = index;
        int left = getLeft(index);
        int right = getRight(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }
        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downHeap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception{
        ArrayList<T> data = new ArrayList<>();

        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
