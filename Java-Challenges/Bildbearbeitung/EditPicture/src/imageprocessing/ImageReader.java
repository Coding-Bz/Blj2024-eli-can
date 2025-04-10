package imageprocessing;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader {


public static ImageData readImage(String path){

    File file =new File(path);

    if(!file.exists()){
        System.out.println("Sowas existiert nicht Obrien Jackson Liebert Fortner Montag Mr. ");
        return null;
    }


    try {
        BufferedImage image= ImageIO.read(file);

        System.out.println("Bis jetzt lief alles erfolgreich");
        System.out.println("Breite: "+image.getWidth());
        System.out.println("Höhe: "+image.getHeight());
        ImageData data =new ImageData(image.getHeight(), image.getWidth(), path, image);
        return data;


    } catch (IOException e) {
        throw new RuntimeException(e);

    }


}}




