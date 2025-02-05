/**
 * Lab 3
 * Represents a library card.
 * @author Ira Goldstein
 * @version 3-Feb-2025
 */
class LibraryCard {
    private int cardNumber;
    private Patron patron;

    /**
     * Constructs a new LibraryCard object.
     *
     * @param cardNumber The card number.
     * @param patron     The patron associated with the card.
     */
    public LibraryCard(int cardNumber, Patron patron) {
        this.cardNumber = cardNumber;
        this.patron = patron;
    }

    /**
     * Gets the card number.
     *
     * @return The card number.
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * Gets the patron associated with the card.
     *
     * @return The patron associated with the card.
     */
    public Patron getPatron() {
        return patron;
    }

    /**
     * Returns a string representation of the LibraryCard object.
     *
     * @return A string representation of the LibraryCard object.
     */
    @Override
    public String toString() {
        return "LibraryCard{" +
                "cardNumber=" + cardNumber +
                ", patron=" + patron +
                '}';
    }
}
