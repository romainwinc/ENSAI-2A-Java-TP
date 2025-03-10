package fr.ensai.library;

abstract class Item {
    // attributes
    protected String title;
    protected int year;
    protected int pageCount;

    // constructor
    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    public abstract void honk();
}
