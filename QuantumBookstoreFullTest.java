public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        PaperBook pb = new PaperBook("111", "Java Basics", 2020, 100.0, "Alice", 5);
        EBook eb = new EBook("222", "Learn AI", 2023, 50.0, "Bob", "PDF");
        ShowcaseBook sb = new ShowcaseBook("333", "Book", 2010, 0.0, "Charles");

        inventory.addBook(pb);
        inventory.addBook(eb);
        inventory.addBook(sb);

        
        inventory.removeOutdatedBook("333", 10);

        
        try {
            double paid = inventory.buyBook("111", 2, "user@example.com", "123 Main St");
            System.out.println("Quantum book store: Paid amount: $" + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        try {
            double paid = inventory.buyBook("222", 1, "user@example.com", null);
            System.out.println("Quantum book store: Paid amount: $" + paid);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
        try {
            inventory.buyBook("333", 1, "user@example.com", null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
