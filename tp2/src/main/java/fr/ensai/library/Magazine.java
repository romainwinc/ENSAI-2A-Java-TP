package fr.ensai.library;

public class Magazine extends Item {
    // Attributes
    private String issn;
    private String issueNumber;

    public Magazine(String issn, String issueNumber, String title, int year, int pageCount)
        //Constructor
        this.issn = issn;
        this. issueNumber = issueNumber;
        super(title);
        super(year);
        super(pageCount);
}
