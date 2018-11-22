public class Book implements Comparable<Book>{
    public String title, author;
    public int price;

    public Book(String title, String author, int price)
    {
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString()
    {
        return String.format("%s written by %s costs %d",title ,author, price );
    }

    //compareTo method to compare price//
    @Override
    public int compareTo(Book book) {
        if (this.getPrice() > book.getPrice() )
            return 1;
        else
            return -1;
    }
}
