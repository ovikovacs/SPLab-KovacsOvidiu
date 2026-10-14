package ro.uvt.info.designpatternslab2026.visitor;

import ro.uvt.info.designpatternslab2026.*;

import java.util.ArrayList;
import java.util.List;

public class GenerateTableOfContents implements Visitor {

    private int pageNumber = 1;

    private final List<String> tableOfContents = new ArrayList<>();

    @Override
    public void visit(Book book) {
        // do nothing
    }

    @Override
    public void visit(Section section) {
        tableOfContents.add(section.getTitle() + " .............. " + pageNumber);
    }

    @Override
    public void visit(Paragraph paragraph) {
        pageNumber++;
    }

    @Override
    public void visit(ImageProxy image) {
        pageNumber++;
    }

    @Override
    public void visit(Image image) {
        pageNumber++;
    }

    @Override
    public void visit(Table table) {
        pageNumber++;
    }

    public void printTableOfContents() {
        for (String line: tableOfContents) {
            System.out.println(line);
        }
    }
}
