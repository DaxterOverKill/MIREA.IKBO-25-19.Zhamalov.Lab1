package Book;

import java.lang.*;
public class BookTest {
    public static void main(String[] args) {
        Book d1 = new Book("Mike", 358);
        Book d2 = new Book("Helen", 210);
        Book d3 = new Book("Bob", 100);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.UnreadPages();
        d2.UnreadPages();
        d3.UnreadPages();
    }
}