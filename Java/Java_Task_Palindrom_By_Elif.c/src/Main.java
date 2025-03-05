import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String theword= scanner.next();
        int important=theword.length()-1;
        int startnumber=0;
        char ne;
        char nee;
        boolean flag=false;
        do {

            ne=theword.charAt(startnumber);
            nee=theword.charAt(important);
            if (ne==nee){
                flag=true;
            }
            else {

                System.out.println("not enough strong armstrong");
                return;
            }

            ne=theword.charAt(startnumber+1);
            nee=theword.charAt(important-1);


            if (startnumber==important){
                System.out.println(flag);
            }

            startnumber++;
        }while (startnumber<important);

        if (flag){
            System.out.println("Armstrongnumber");
        }
        else System.out.println("nuh uh");
    }
}