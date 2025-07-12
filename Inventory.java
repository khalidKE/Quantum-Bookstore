import java.util.*;

public class Inventory {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Quantum book store: Book added - " + book.title);
    }

    public Book removeOutdatedBook(String isbn, int maxYearsOld) {
        Book book = books.get(isbn);
        if (book != null && (2025 - book.getYear()) > maxYearsOld) {
            books.remove(isbn);
            System.out.println("Quantum book store: Removed outdated book - " + book.title);
            return book;
        }
        return null;
    }

    public double buyBook(String isbn, int quantity, String email, String address) {
        Book book = books.get(isbn);
        if (book == null || !book.isAvailable()) {
            throw new RuntimeException("Quantum book store: Book not available for purchase.");
        }

        if (book instanceof PaperBook) {
            PaperBook pb = (PaperBook) book;
            pb.reduceStock(quantity);
            ShippingService.send(address, pb, quantity);
            return pb.getPrice() * quantity;
        } else if (book instanceof EBook) {
            EBook eb = (EBook) book;
            MailService.send(email, eb);
            return eb.getPrice() * quantity;
        } else {
            throw new RuntimeException("Quantum book store: Cannot purchase this type of book.");
        }
    }
}
