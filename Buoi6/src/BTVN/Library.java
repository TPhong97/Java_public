package BTVN;
import java.util.*;
public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks(boolean showPublisher) {
        if (books.isEmpty()) {
            System.out.println("Thư viện chưa có sách nào!");
            return;
        }
        for (Book b : books) b.displayInfo(showPublisher);
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book b : books) {
            if (b.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                b.displayInfo(true);
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy sách của tác giả: " + author);
    }

    public void removeBookById(int bookId) {
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.getBookId() == bookId) {
                it.remove();
                System.out.println("Đã xóa sách có ID: " + bookId);
                return;
            }
        }
        System.out.println("Không tìm thấy sách có ID: " + bookId);
    }
}
