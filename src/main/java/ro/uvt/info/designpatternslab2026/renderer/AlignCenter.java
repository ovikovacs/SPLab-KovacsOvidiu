package ro.uvt.info.designpatternslab2026.renderer;

import ro.uvt.info.designpatternslab2026.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph) {
        String text = paragraph.getText();
        StringBuilder textToRender = new StringBuilder();

        while (text.length() > 30) {
            String row = text.substring(0, 30);
            text = text.substring(30);
            textToRender.append(row);
        }

        int numberOfWhiteSpace = 30 - text.length();
        int halfNumberOfWhiteSpaces = numberOfWhiteSpace/2;
        textToRender.append(" ".repeat(halfNumberOfWhiteSpaces));
        textToRender.append(text);
        textToRender.append(" ".repeat(numberOfWhiteSpace - halfNumberOfWhiteSpaces));

        System.out.println(textToRender.toString());
    }
}
