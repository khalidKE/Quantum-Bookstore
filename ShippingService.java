public class ShippingService {
    public static void send(String address, PaperBook book, int quantity) {
        System.out.println("Quantum book store: Shipping " + quantity + " copy(ies) of '" + book.title + "' to " + address);
    }
}
