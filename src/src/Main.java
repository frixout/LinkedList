import jdk.swing.interop.SwingInterOpUtils;

import java.util.SortedMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        LinkedListCustom list = new LinkedListCustom();
        list.add("Hi");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Aidar");
        //System.out.println(list);
        list.printList();
        list.add("Alina");
        list.printList();
        System.out.println("Size: " + String.valueOf(list.size) + "\n");
        System.out.println(list.get(5));
        LinkedListCustom list2= new LinkedListCustom();
        list2.add("Hello");
        list2.add("My");
        list2.add("Name");
        list2.add("Is");
        list2.add("aidar");
        //System.out.println(list);
        list2.printList();
        list2.add("alina");
        list2.printList();
        System.out.println("Size: " + String.valueOf(list2.size) + "\n");
        System.out.println(list2.get(5));
    }
}