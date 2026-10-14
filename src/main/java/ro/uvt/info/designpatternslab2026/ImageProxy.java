package ro.uvt.info.designpatternslab2026;

import lombok.Getter;

@Getter
public class ImageProxy implements Element {

    private final String name;

    private Image realImage;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        Image image = loadImage();
        image.print();
    }

    private Image loadImage() {
        if (realImage == null) {
            realImage = new Image(name);
        }
        return realImage;
    }
}
