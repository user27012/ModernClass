public class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<Integer> linkedList = new ModernUnidirectionalLinkedList<>();

        // Добавляем элементы в список
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        // Выводим список
        System.out.print("Список: ");
        linkedList.printList();

        // Удаляем элемент
        linkedList.remove(2);

        // Выводим список после удаления
        System.out.print("Список после удаления: ");
        linkedList.printList();

        // Проверяем, содержит ли список определенный элемент
        System.out.println("Список содержит элемент 3: " + linkedList.contains(3));

        // Получаем размер списка
        System.out.println("Размер списка: " + linkedList.size());
    }
}