package ro.uvt.info.designpatternslab2026;

import lombok.Getter;
import ro.uvt.info.designpatternslab2026.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Section implements Element {
    private final List<Element> elements = new ArrayList<>();
    private final String title;

    public Section(String s) {
        title = s;
    }

    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Element element: elements) {
            element.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element element: elements) {
            element.accept(visitor);
        }
    }
}
