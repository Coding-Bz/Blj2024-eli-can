package Image;

import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

ColorPicker pick=new ColorPicker();
        ArrayList<String> height=new ArrayList<>();
        ArrayList<String> width=new ArrayList<>();
       File file = new File("C:\\Blj2024-eli-can\\Java-Challenges\\Bildbearbeitung\\ASCII-Image\\src\\Image\\Rainbow.jpeg");
        ArrayList<Integer> i= pick.getSize();
        System.out.println(i);
        ASCIIPicker imageCreator=new ASCIIPicker();

        pick.pickerColor(file,height, width);








    }
}