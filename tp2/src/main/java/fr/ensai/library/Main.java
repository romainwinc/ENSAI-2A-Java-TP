package fr.ensai.library;

public class Main {

    public static void main(String[] args) {

        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);

        System.out.println(fellowshipOfTheRing.toString());

        Library firstlLibrary = new Library("FirstLibrary");

        Magazine firtMagazine = new Magazine("super titre", "2025", "167", 0, 0);
        Magazine secondMagazine = new Magazine("super titre 2", "2026", "17", 0, 0);

        firstlLibrary.addItem(firtMagazine);
        firstlLibrary.addItem(secondMagazine);
        firstlLibrary.displayItems();
    }
}