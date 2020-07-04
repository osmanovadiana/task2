
public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(40);
        list.add(40);
        list.add(15);
        list.add(28);
        list.add(28);
        list.add(28);
        list.add(100);
        list.add(100);
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println("Количество: " + list.size());
        System.out.println("Список без дублей: ");
        list.removeDob();
        list.writeList();
    }
}