public class TreeRunning {
    public static void main(String[] args) {
        System.out.println("Пример дерева с типом данных Integer:");
        Tree<Integer> tree = new Tree<>();
        tree.add(5);
        tree.add(2);
        tree.add(4);
        tree.add(3);
        tree.add(7);
        tree.add(6);
        tree.add(10);
        tree.add(12);

        System.out.println("Поиск первого элемента: " + tree.findFirst());
        System.out.println("Обход в ширину  BFS (Breath-first search): " + tree.bfs());
        System.out.println("Обход в глубину DFS (Depth-first search): " + tree.dfs());
        tree.remove(3); // удалить 3
        System.out.println("Обход в глубину DFS (Depth-first search): " + tree.dfs());

        System.out.println(tree.contains(5));
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(4));
        System.out.println(tree.contains(3));

        System.out.println(tree.contains(1));
        System.out.println(tree.contains(6));

        System.out.println("Пример дерева с типом данных String:");
        Tree<String> treeStr = new Tree<>();
        treeStr.add("Иван");
        treeStr.add("Лена");
        treeStr.add("Петя");
        treeStr.add("Лиза");
        System.out.println("Поиск первого элемента: " + treeStr.findFirst());
        System.out.println("Поиск в ширину  BFS Breath-first search: " + treeStr.bfs());
        System.out.println("Поиск в глубину DFS Depth-first search: " + treeStr.dfs());

        System.out.println(treeStr.contains("Петя"));
        System.out.println(treeStr.contains("Вася"));
        System.out.println(treeStr.contains("Лиза"));
        System.out.println(treeStr.contains("Оля"));
    }
}