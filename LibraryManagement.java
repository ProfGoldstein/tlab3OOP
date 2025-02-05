/** 
 * 
 * Lab 3
 * Main class for demonstrating library management.
 *
 * @author Ira Goldstein
 * @version 3-Feb-2025
 *
 **/
public class LibraryManagement { 

    /**
     * Main method for demonstrating library management.
     *
     * @param args Command line arguments (not used).
     *
     */
    public static void main(String[] args) {
        Patron john = new Patron("John Doe", 123);
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1);
        Book book2 = new Book("Pride and Prejudice and Zombies", "Seth Grahame-Smith", 2);
        LibraryCard card1 = new LibraryCard(1001, john);

        System.out.println("\nCurrent Patron Info: " + john + "\n"); // Before checking out any books

        // Simulate checking out a book
		System.out.println(john.checkOutBook(book1));

        System.out.println("\nCurrent Patron Info: " + john + "\n"); // After checking out a book

        // Simulate checking out a book that was already checked out
		System.out.println(john.checkOutBook(book1));

		// Simulate checking out a second book
		System.out.println(john.checkOutBook(book2));

        System.out.println("\nCurrent Patron Info: " + john + "\n"); // After checking out a second book

        // Simulate returning a book
        System.out.println(john.returnBook(book1));

        System.out.println("\nCurrent Patron Info: " + john + "\n"); // After returning a book

    }
}