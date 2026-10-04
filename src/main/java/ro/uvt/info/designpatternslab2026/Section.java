package ro.uvt.info.designpatternslab2026;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Section implements Element {
    private final List<Element> elements = new ArrayList<>();
    private final String text;

    public Section(String s) {
        text = s;
    }

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println(text);
        for (Element element: elements) {
            element.print();
        }
    }
}
