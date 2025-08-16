package BTVN;

public class Book {
    private static int autoId = 1;
    private int bookId;
    private String title;
    private String author;
    private double price;
    private Publisher publisher;

    public Book(String title, String author, double price, Publisher publisher) {
        this.bookId = autoId++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    public Book(String title, String author, double price) {
        this(title, author, price, new Publisher("Unknown", "Unknown"));
    }

    public void displayInfo() {
        System.out.println("ID: " + bookId + " | Tên: " + title +
                " | Tác giả: " + author + " | Giá: " + price);
    }

    public void displayInfo(boolean showPublisher) {
        displayInfo();
        if (showPublisher) {
            System.out.println("   Nhà xuất bản: " + publisher.getName() +
                    " - " + publisher.getAddress());
        }
    }

    public int getBookId() { return bookId; }
    public String getAuthor() { return author; }
}
