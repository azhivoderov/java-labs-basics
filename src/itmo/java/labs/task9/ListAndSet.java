package itmo.java.labs.task9;

import java.time.LocalTime;
import java.util.*;

public class ListAndSet {

    public Set<Integer> get(List<Integer> list){

        return new HashSet<>(list);

    }

    public static List<Integer> myArrayLinkedList(List<Integer> list){
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        return list;
    }

    public static Integer findElements(List<Integer> list, Integer numberTime){
        System.out.println("Выбираем " + numberTime.toString() + " рандомных элемента списка " + list.getClass().getSimpleName());
        System.out.println("Время начала " + LocalTime.now().toString());
        Random random = new Random();
        Integer t = null;
        for (int i = 0; i < numberTime; i++) {
            t = list.get(random.nextInt(list.size()));
        }
        System.out.println("Время окончания - " + LocalTime.now().toString());
        return t;
    }


}
