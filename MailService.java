public class MailService {
    public static void send(String email, EBook ebook) {
        System.out.println("Quantum book store: Sending EBook '" + ebook.title + "' to " + email);
    }
}
