package ro.uvt.info.designpatternslab2026.visitor;

import ro.uvt.info.designpatternslab2026.*;

public class BookStatistics implements Visitor {

    private int numberOfImages = 0;
    private int numberOfParagraphs = 0;
    private int numberOfSections = 0;
    private int numberOfTables = 0;

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(Section book) {
        numberOfSections++;
    }

    @Override
    public void visit(Paragraph book) {
        numberOfParagraphs++;
    }

    @Override
    public void visit(ImageProxy book) {
        numberOfImages++;
    }

    @Override
    public void visit(Image book) {
        numberOfImages++;
    }

    @Override
    public void visit(Table book) {
        numberOfTables++;
    }

    public void printStatistics() {
        System.out.println("Book statistics:");
        System.out.println("*** Number of images: " + numberOfImages);
        System.out.println("*** Number of tables: " + numberOfTables);
        System.out.println("*** Number of paragraphs: " + numberOfParagraphs);
    }
}
