package algorithms_gb.HW_3;

//Урок 4. Структуры данных дерево и хэш-таблица
//Необходимо превратить собранное на семинаре дерево поиска в полноценное левостороннее красно-черное дерево. 
//И реализовать в нем метод добавления новых элементов с балансировкой.

//Красно-черное дерево имеет следующие критерии:
//• Каждая нода имеет цвет (красный или черный)
//• Корень дерева всегда черный
//• Новая нода всегда красная
//• Красные ноды могут быть только левым ребенком
//• У краной ноды все дети черного цвета

//Соответственно, чтобы данные условия выполнялись, после добавления элемента 
//в дерево необходимо произвести балансировку, благодаря которой все критерии выше станут валидными. 
//Для балансировки существует 3 операции – левый малый поворот, правый малый поворот и смена цвета.

public class main {
    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.add(6);
        tree.add(3);
        tree.add(2);
        tree.add(4);
        tree.add(5);
        tree.add(1);
        tree.add(9);
        tree.add(7);
        tree.add(11);
        tree.add(8);
        tree.add(12);
        tree.add(15);
        tree.add(10);

        tree.print();

    }
}
