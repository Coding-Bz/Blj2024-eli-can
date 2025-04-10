import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
 Integer [] originalWord={1,2,3,4,5,6,7,8,9};
int countingBackwards= 0;
        for (int counting=originalWord.length-1; counting>= 0; counting--){

           originalWord[countingBackwards]=originalWord[counting];

            System.out.println("das is der eigentlich wert: "+countingBackwards);
            System.out.println("der neue: "+counting);


           countingBackwards++;

 }

        System.out.println(Arrays.toString(originalWord));
    }
}