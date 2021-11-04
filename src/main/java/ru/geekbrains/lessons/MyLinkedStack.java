package ru.geekbrains.lessons;

public class MyLinkedStack<T> {

    private MyLinkedList2<T> list;

    public MyLinkedStack() { this.list = new MyLinkedList2(); }

    public void push(T item) { list.insertLast(item); }

    public T pop() { return list.deleteLast(); }

    public T peek() { return list.getLast(); }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }
}