package fr.ensai.library;

public class Magazine extends Item {
    // Attributes
    private String issn;
    private String issueNumber;

    public Magazine(String issn, String issueNumber, String title, int year, int pageCount) {
        // Constructor
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }
}
