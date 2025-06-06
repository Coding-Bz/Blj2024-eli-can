package imageprocessing;
import java.awt.image.BufferedImage;


public class ImageData {

    int height;
    int width;
    String pfad;
    BufferedImage image;

    public  ImageData(){

    }
    public  ImageData(int height, int width, String pfad, BufferedImage image){

        this.height=height;
        this.width=width;
        this.pfad=pfad;
        this.image=image;


    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPfad() {
        return pfad;
    }

    public void setPfad(String pfad) {
        this.pfad = pfad;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
