package ro.uvt.info.designpatternslab2026;

import lombok.Getter;
import ro.uvt.info.designpatternslab2026.visitor.Visitor;

@Getter
public class Table implements Element {

    private final String name;

    public Table(String newName) {
        name = newName;
    }

    @Override
    public void print() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
