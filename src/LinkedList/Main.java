package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(null);
        list.push(5);
        list.push(4);
        list.push(2);
        list.print();
        list.pushToIndex(0,6);
        list.print();
        System.out.println("//////////////");
        Integer a = list.get(1);
        list.print();
        System.out.println("a = " + a);
        System.out.println(list.size());
        System.out.println("//////////////");
        list.print();
        list.remove();
        list.print();
        list.remove();
        list.print();
        list.remove();
        list.print();

//        list.pushToTail(6);
//        list.print();
//        System.out.println(list.remove());
//        list.remove();
//        list.remove();
//        list.remove();
//        System.out.println(list.remove());
//        list.print();
    }
}
