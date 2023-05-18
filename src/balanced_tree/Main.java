package balanced_tree;

public class Main {
    public static void main(String[] args) {
        BalancedTree balancedTree = new BalancedTree();

        // Добавление элементов в дерево
        balancedTree.add(5);
        balancedTree.add(3);
        balancedTree.add(7);
        balancedTree.add(2);
        balancedTree.add(4);
        balancedTree.add(8);
        balancedTree.add(10);
        balancedTree.add(9);

        // Проверка наличия элемента в дереве
        System.out.println("Search 3: " + balancedTree.search(3));
        System.out.println("Search 6: " + balancedTree.search(6));

        // Удаление элемента из дерева
        balancedTree.remove(3);

        // Получение глубины дерева
        System.out.println("Depth: " + balancedTree.getDepth());

        // Получение количества узлов в дереве
        System.out.println("Size: " + balancedTree.getSize());

        // Обход дерева в ширину
        System.out.print("Breadth-first Traversal: ");
        balancedTree.traversalWidth();

        // Обход дерева в глубину
        System.out.print("Depth-first Traversal: ");
        balancedTree.traversalDepth();
    }
}
