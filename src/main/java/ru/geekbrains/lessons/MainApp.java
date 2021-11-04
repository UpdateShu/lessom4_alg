package ru.geekbrains.lessons;

import java.util.ListIterator;

public class MainApp {

    public static void main(String[] args) {

        //Тест MyLinkedStack по задаче из предыдущего ДЗ
        testStack();
        System.out.println();

        MyLinkedList2<Integer> lst = new MyLinkedList2<>();
        lst.insertFirst(1);
        lst.insertFirst(2);
        lst.insertFirst(3);
        lst.insertFirst(4);
        lst.insertFirst(5);
        System.out.println(lst);

        ListIterator<Integer> litr = lst.listIterator();
        while(litr.hasNext()) {
            Object element = litr.next();
            System.out.print(element + " ");
            if (litr.nextIndex() > 3)
                litr.set(999);
            System.out.print(" ->next[" + litr.nextIndex() + "] ");
        }
        System.out.println();
        System.out.println(lst);

        litr = lst.listIterator();
        while(litr.hasPrevious()) {
            System.out.print(" prev[" + litr.previousIndex() + "]");
            Object element = litr.previous();
            System.out.print(" ->" + element);
            if (litr.previousIndex() == 0)
                litr.set(999);
        }
        System.out.println();
        System.out.println();

        litr = lst.listIterator();
        if (litr.hasNext()) {
            litr.next();
            litr.remove();
        }
        System.out.println(lst);
        litr = lst.listIterator();
        if (litr.hasPrevious()) {
            litr.previous();
            litr.remove();
        }
        System.out.println(lst);

        litr = lst.listIterator();
        if (litr.hasNext()) {
            litr.next();
            litr.add(777);
        }
        System.out.println(lst);
    }

    static void testStack()
    {
        String text = "А роза упала на лапу Азора";

        MyLinkedStack<Character> stack = new MyLinkedStack<>();
        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }
        String inverse = "";
        while (!stack.isEmpty()) {
            inverse += stack.pop();
        }
        System.out.println("Переворот строки: " + inverse);
    }
}
