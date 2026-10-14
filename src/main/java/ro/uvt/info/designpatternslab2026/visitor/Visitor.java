package ro.uvt.info.designpatternslab2026.visitor;

import ro.uvt.info.designpatternslab2026.*;

public interface Visitor {

    void visit(Book book);

    void visit(Section book);

    void visit(Paragraph book);

    void visit(ImageProxy book);

    void visit(Image book);

    void visit(Table book);
}
