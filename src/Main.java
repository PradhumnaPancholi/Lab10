import java.util.TreeSet;

public class Main {

    public static void main(String[] args)
    {
        Book book1 = new Book("How to Write Creative Titles E1", "Jaret Wright", 78  );
        Book book2 = new Book("How to Write Creative Titles E2", "Jaret Wright", 56  );
        Book book3 = new Book("How to Write Creative Titles E3", "Jaret Wright", 86  );
        Book book4 = new Book("How to Write Creative Titles E4", "Jaret Wright", 115  );

        //Data structure to filter duplicates//
        TreeSet<Object> ts1= new TreeSet<>();

        //adding book objects to treeset//
        ts1.add(book1);
        ts1.add(book2);
        ts1.add(book3);
        ts1.add(book4);

        System.out.println(ts1);
    }
}
