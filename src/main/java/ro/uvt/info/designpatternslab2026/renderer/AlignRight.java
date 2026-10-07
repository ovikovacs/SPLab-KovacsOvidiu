package ro.uvt.info.designpatternslab2026.renderer;

import ro.uvt.info.designpatternslab2026.Paragraph;

public class AlignRight implements AlignStrategy {

    @Override
    public void render(Paragraph paragraph) {
        String text = paragraph.getText();
        StringBuilder textToRender = new StringBuilder();

        while (text.length() > 30) {
            String row = text.substring(0, 30);
            text = text.substring(30);
            textToRender.append(row);
        }

        int numberOfWhiteSpaces = 30 - text.length();
        textToRender.append(" ".repeat(numberOfWhiteSpaces)).append(text);

        System.out.println(textToRender.toString());
    }
}
