package ro.uvt.info.designpatternslab2026;

import lombok.Getter;

@Getter
public class Author {

    private final String name;

    public Author(String author) {
        name = author;
    }

    public void print() {
        System.out.println("Author: " + name);
    }
}
