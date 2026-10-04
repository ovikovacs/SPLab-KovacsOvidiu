package ro.uvt.info.designpatternslab2026;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Book {
    private final String title;
    private final List<Author> authors = new ArrayList<>();
    private final List<Element> elements = new ArrayList<>();

    public Book(String newTitle) {
        title = newTitle;
    }

    public void addAuthor(Author newAuthor) {
        authors.add(newAuthor);
    }

    public void addContent(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println();
        System.out.println("Authors:");
        for (Author author: authors) {
            author.print();
        }
        System.out.println();
        for (Element element: elements) {
            element.print();
        }
    }
}
