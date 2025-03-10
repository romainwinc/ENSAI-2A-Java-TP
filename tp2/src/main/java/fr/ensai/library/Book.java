package fr.ensai.library;

public class Book extends Item {
    /**
     * Represents a book.
     */
    public class Book {

        // Attributes
        private String isbn;
        private String title;
        private Author author;
        private int year;
        private int pageCount;

        /**
         * Constructs a new Book object.
         */
        public Book(String isbn, String title, Author author, int year, int pageCount) {
            this.isbn = isbn;
            super(title);
            this.author = author;
            super(year);
            super(pageCount);
        }

        public Author getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return "Book " + title + " written by " + author.toString();
        }

    }
}