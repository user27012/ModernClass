public class Main {
    public static void main(String[] args) {
        ModernUnidirectionalLinkedList<Integer> linkedList = new ModernUnidirectionalLinkedList<>();


        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);


        System.out.print("Список: ");
        linkedList.printList();


        linkedList.remove(2);


        System.out.print("Список после удаления: ");
        linkedList.printList();


        System.out.println("Список содержит элемент 3: " + linkedList.contains(3));


        System.out.println("Размер списка: " + linkedList.size());
    }
}