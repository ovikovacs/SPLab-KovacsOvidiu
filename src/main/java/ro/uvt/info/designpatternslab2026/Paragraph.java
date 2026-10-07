package ro.uvt.info.designpatternslab2026;

import lombok.Getter;
import lombok.Setter;
import ro.uvt.info.designpatternslab2026.renderer.AlignStrategy;

@Getter
@Setter
public class Paragraph implements Element {

    private final String text;

    private AlignStrategy alignStrategy;

    public Paragraph(String s) {
        text = s;
    }

    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this);
        } else {
            System.out.println(text);
        }
    }
}
