import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Sortable[] shapes = new Sortable[4];
        shapes[0] = new Circle(20);
        shapes[1] = new Circle(10);
        shapes[2] = new Rectangle(10, 20);
        shapes[3] = new Rectangle(20, 5);


        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

      for (int i =1; i< shapes.length; i++){

          for (int j=0; j< shapes.length; j++){
              shapes[i].compareTo(shapes[j]);
          }
      }


    }
}