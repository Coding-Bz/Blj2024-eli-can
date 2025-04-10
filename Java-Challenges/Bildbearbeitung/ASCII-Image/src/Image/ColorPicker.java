package Image;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ColorPicker {
    ArrayList <Integer> size=new ArrayList<>();
public  ColorPicker(){

}

public ColorPicker(ArrayList <Integer> size){
    this.size=size;
}



    public ArrayList<Integer>  pickerColor(File file, ArrayList<String> height, ArrayList<String> width) {
        char[][] realImage=new char[1013][1013];
        try {

            BufferedImage image = ImageIO.read(file);

            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    Color pixel = new Color(image.getRGB(x, y));
                    int r = pixel.getRed();
                    int g = pixel.getGreen();
                    int b = pixel.getBlue();
                    if (x == 0) {
                        height.add(",");
                    }
                    if (y == 0) {
                        width.add(",");
                    }



                    double value = Math.sqrt(r * r * 0.299 + g * g * 0.587 + b * b * 0.114);
                    int myValue=(int)value/26;

                    switch (myValue) {
                        case 0:{
                            realImage[x][y]='@';
                        }

                        case 1:{
                            realImage[x][y]='%';
                            break;
                        }
                        case 2:{
                            realImage[x][y]='#';
                            break;
                        }
                        case 3:{
                            realImage[x][y]='#';
                            break;
                        }
                        case 4:{
                            realImage[x][y]='*';
                            break;
                        }
                        case 5:{
                            realImage[x][y]='=';
                            break;
                        }
                        case 6:{
                            realImage[x][y]='-';
                        }
                        case 7:{
                            realImage[x][y]=':';
                            break;
                        }

                        case 8:{
                            realImage[x][y]='.';
                            break;
                        }

                        case 9:{
                            realImage[x][y]='"';
                            break;
                        }
                    }



                    size.add((int) value);


                    for (int i=0; i<realImage.length;i++){
                        System.out.println();
                        for (int j=0; j<realImage[0].length; j++){

                            System.out.print(realImage[i][j]);
                        }
                    }

                }

            }





        } catch (IOException e) {
            System.out.println("Fehler beim Laden des Bildes: " + e.getMessage());
        }


        this.size=size;
        return size;



    }


    public ArrayList<Integer> getSize() {
        return size;
    }


}
