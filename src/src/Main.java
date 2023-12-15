import jdk.swing.interop.SwingInterOpUtils;

import java.util.LinkedList;
import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) throws IndexOutsideTheList {
        LinkedListCustom<String> list = new LinkedListCustom<>();
        list.add("Hi");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Aidar");
        list.printList();
        list.add("Alina");
        list.printList();
        System.out.println("Size: " + String.valueOf(list.getSize()) + "\n");
        System.out.println("get: " + list.get(3));

        LinkedListCustom<String> list2= new LinkedListCustom<>();
        list2.add("Hello");
        list2.add("My");
        list2.add("Name");
        list2.add("Is");
        list2.add("aidar");
        list2.printList();
        list2.add("alina");
        list2.printList();
        System.out.println("Size: " + String.valueOf(list2.getSize()) + "\n");
        System.out.println("get: " + list2.get(2));

        list2.set(2,"firstName");
        list2.printList();
        System.out.println("Size: " + String.valueOf(list2.getSize()) + "\n");

        list2.remove(0);
        list2.printList();
        System.out.println("Size: " + String.valueOf(list2.getSize()) + "\n");
        list2.remove(4);
        list2.printList();
        System.out.println("Size: " + String.valueOf(list2.getSize()) + "\n");
        list2.remove(2);
        list2.printList();
        System.out.println("Size: " + String.valueOf(list2.getSize()) + "\n");

    }
}