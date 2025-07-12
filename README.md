# Quantum Bookstore

Quantum Bookstore is a simple, extensible Java-based simulation of an online bookstore.  
It supports multiple book types (Paper, EBook, Showcase), and handles operations such as inventory management and purchasing.

---

## 📦 Features

- Add books to inventory
- Remove outdated books
- Buy books (handles paper book shipping and ebook emailing)
- Print all outputs prefixed with `Quantum book store`
- Easily extensible for new product types

---

## 📚 Book Types

- **PaperBook**  
  - Has stock quantity  
  - Delivered via `ShippingService`

- **EBook**  
  - Has a file type (e.g., PDF, EPUB)  
  - Sent via `MailService`

- **ShowcaseBook**  
  - Not for sale (display only)

---

## 🛠 Project Structure

```text
.
├── Book.java
├── PaperBook.java
├── EBook.java
├── ShowcaseBook.java
├── Inventory.java
├── ShippingService.java
├── MailService.java
├── QuantumBookstoreFullTest.java
