package ro.uvt.info.designpatternslab2026;

import lombok.Getter;

@Getter
public class Paragraph implements Element {

    private final String text;

    public Paragraph(String s) {
        text = s;
    }

    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}
