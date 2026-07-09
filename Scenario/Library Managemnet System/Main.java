public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book b1 = new Book("Harry Potter", "J.K. Rowling", "101");
        Book b2 = new Book("The Alchemist", "Paulo Coelho", "102");
        Book b3 = new Book("Wings of Fire", "A.P.J Abdul Kalam", "103");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        System.out.println("\nAll Books in Library:");
        library.displayAllBooks();

        System.out.println("\nSearching for 'The Alchemist':");
        Book found = library.searchByTitle("The Alchemist");

        if (found != null) {
            System.out.println("Book Found:");
            found.displayBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}
