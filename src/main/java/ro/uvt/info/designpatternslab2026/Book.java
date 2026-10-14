package ro.uvt.info.designpatternslab2026;

import lombok.Getter;
import ro.uvt.info.designpatternslab2026.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Book extends Section {
    private final List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author newAuthor) {
        authors.add(newAuthor);
    }

    public void print() {
        System.out.println("Book: " + getTitle());
        System.out.println();
        System.out.println("Authors:");
        for (Author author: authors) {
            author.print();
        }
        System.out.println();
        for (Element element: getElements()) {
            element.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
