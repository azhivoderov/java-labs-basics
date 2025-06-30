package itmo.java.labs.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        //1
        List<Integer> list = new ArrayList<>();
            list.add(153);
            list.add(153);
            list.add(153);
            list.add(153);
            list.add(153);
            list.add(153);
            list.add(153);
            list.add(153);
            list.add(153);
            list.add(153);
            list.add(155);

        ListAndSet listToSet = new ListAndSet();

        System.out.println(listToSet.get(list));

        //2
        List<Integer> myArrayList = new ArrayList<>();
        ListAndSet.myArrayLinkedList(myArrayList);

        System.out.println();

        List<Integer> myLinkedList = new LinkedList<>();
        ListAndSet.myArrayLinkedList(myLinkedList);

        System.out.println();

        ListAndSet.findElements(myArrayList, 100000);
        System.out.println();
        ListAndSet.findElements(myLinkedList, 10000);

/*
        Метод ArrayList.get() работает быстрее чем LinkedList.get()

        Изучив классы, определяем, что поиск элемента в ArrayList осуществляется по индексу

         public E get(int index) {
                Objects.checkIndex(index, size);
                return elementData(index);
            }

        тогда как поиск элемента в LinkedList осуществляется перебором по всему списку

            public E get(int index) {
                checkElementIndex(index);
                return node(index).item;
            }

            Node<E> node(int index) {
                // assert isElementIndex(index);

                if (index < (size >> 1)) {
                    Node<E> x = first;
                    for (int i = 0; i < index; i++)
                        x = x.next;
                    return x;
                } else {
                    Node<E> x = last;
                    for (int i = size - 1; i > index; i--)
                        x = x.prev;
                    return x;
                }
            }
            */


        //3
        UserMap userMap = new UserMap();
        userMap.setMap(new User("Ivan"),1562);
        userMap.setMap(new User("Dan"), 1745);
        userMap.setMap(new User("Eva"), 3452);

//        System.out.println(userMap.getMap());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(userMap.getValue(bufferedReader.readLine()));

    }
}
