package ro.uvt.info.designpatternslab2026;

import ro.uvt.info.designpatternslab2026.visitor.Visitor;

public interface Element {

    void print();

    void accept(Visitor visitor);
}
