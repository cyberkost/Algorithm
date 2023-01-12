package homework_01_12_2023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ComparisonList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++)
            arrayList.get(i);
        long end = System.currentTimeMillis();
        System.out.println("Time taken for arrayList is " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++)
            linkedList.get(i);
        end = System.currentTimeMillis();
        System.out.println("Time taken for linkedList is " + (end - start) + " ms");

        start = System.currentTimeMillis();
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext())
            iterator.next();
        end = System.currentTimeMillis();
        System.out.println("Time taken for Iterator linkedList is " + (end - start) + " ms");
    }
}

// ArrayList знает адрес и по индексу быстро находит. O(n)
// LinkedList всегда начинает поиск с нулевого элемента. Медленнее. O(n^2)
// Для LinkedList лучше использовать Iterator.