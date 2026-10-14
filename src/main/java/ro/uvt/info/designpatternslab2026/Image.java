package ro.uvt.info.designpatternslab2026;

import lombok.Getter;

import java.util.concurrent.TimeUnit;

@Getter
public class Image implements Element {

    private final String image;
    public Image(String name) {
        image = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("Image: " + image);
    }
}
