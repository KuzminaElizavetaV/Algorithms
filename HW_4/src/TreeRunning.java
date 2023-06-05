public class TreeRunning {
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>();
        tree.add(5);
        tree.add(2);
        tree.add(4);
        tree.add(3);
        System.out.println("Пример дерева с типом данных Integer:");

        System.out.println(tree.contains(5));
        System.out.println(tree.contains(2));
        System.out.println(tree.contains(4));
        System.out.println(tree.contains(3));

        System.out.println(tree.contains(1));
        System.out.println(tree.contains(6));

        Tree<String> treeStr = new Tree<>();
        treeStr.add("Иван");
        treeStr.add("Лена");
        treeStr.add("Петя");
        treeStr.add("Лиза");
        System.out.println("Пример дерева с типом данных String:");
        System.out.println(treeStr.contains("Петя"));
        System.out.println(treeStr.contains("Вася"));
        System.out.println(treeStr.contains("Лиза"));
        System.out.println(treeStr.contains("Оля"));
    }
}