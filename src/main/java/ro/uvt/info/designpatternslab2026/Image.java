package ro.uvt.info.designpatternslab2026;

import lombok.Getter;

@Getter
public class Image implements Element {

    private final String url;
    public Image(String s) {
        url = s;
    }

    @Override
    public void print() {
        System.out.println("Image: " + url);
    }
}
