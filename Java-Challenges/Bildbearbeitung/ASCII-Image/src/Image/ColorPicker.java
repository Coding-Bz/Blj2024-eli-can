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
        char[][] realImage=new char[478][850];
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

                    int myValue=(int)Math.sqrt(r * r * 0.299 + g * g * 0.587 + b * b * 0.114)/26;

                    switch (myValue) {
                        case 0:{
                            realImage[y][x]='@';
                        }

                        case 1:{
                            realImage[y][x]='%';
                            break;
                        }
                        case 2:{
                            realImage[y][x]='#';
                            break;
                        }
                        case 3:{
                            realImage[y][x]='#';
                            break;
                        }
                        case 4:{
                            realImage[y][x]='*';
                            break;
                        }
                        case 5:{
                            realImage[y][x]='=';
                            break;
                        }
                        case 6:{
                            realImage[y][x]='-';
                        }
                        case 7: {
                            realImage[y][x]=':';
                            break;
                        }

                        case 8:{
                            realImage[y][x]='.';
                            break;
                        }

                        case 9:{
                            realImage[y][x]='"';
                            break;
                        }


                        default:{
                            realImage[y][x]='"';
                        }
                    }


                }

            }





        } catch (IOException e) {
            System.out.println("Fehler beim Laden des Bildes: " + e.getMessage());
        }


        for (int i=0; i<realImage.length;i++){
            for (int j=0; j<realImage[0].length; j++){

                System.out.print(realImage[i][j]);
            }
            System.out.println();
        }
        this.size=size;
        return size;



    }


    public ArrayList<Integer> getSize() {
        return size;
    }


}
