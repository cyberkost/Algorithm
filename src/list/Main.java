package list;

public class Main {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(10);
        myLinkedList.add(30);
        myLinkedList.add(40);
        System.out.println("Добавляем элементы в список:");
        myLinkedList.print();

        System.out.println("Добавляем элемент в конец списка:");
        myLinkedList.add(40);
        myLinkedList.print();

        System.out.println("Добавляем элемент по индексу:");
        myLinkedList.addAt(1,20);
        myLinkedList.print();

        System.out.println("Удаляем элемент:");
        myLinkedList.remove(40);
        myLinkedList.print();

        System.out.println("Удаляем элемент по индексу:");
        myLinkedList.removeAt(2);
        myLinkedList.print();

        System.out.println("Заменяем элемент по указанному индексу:");
        myLinkedList.set(0,100);
        myLinkedList.print();

        System.out.println("Возвращаем элемент по указанному индексу:");
        System.out.println(myLinkedList.get(2));

        System.out.println("Возвращаем true - если элемент есть в списке");
        System.out.println(myLinkedList.contains(100));

        System.out.println("Возвращаем false - если элемента нет в списке");
        System.out.println(myLinkedList.contains(100000));

        System.out.println("Проверяем список на наличие элементов:");
        System.out.println(myLinkedList.isEmpty());

        System.out.println("Возвращаем количество элементов в списке:");
        System.out.println(myLinkedList.size);

        System.out.println("Удаляем все элементы методом clear, оставляем пустой список");
        myLinkedList.clear();

        System.out.println("Проверяем список на наличие элементов и возвращаем количество элементов:");
        System.out.println(myLinkedList.isEmpty());
        System.out.println(myLinkedList.size);
    }
}
