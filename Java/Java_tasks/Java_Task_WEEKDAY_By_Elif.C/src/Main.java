import java.util.*;
public class Main {
    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);


    String[] weekdays={"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag" +
            "Sammstag","Sonntag"};
    int[] num={0,1,2,3,4,5,6};
    String Datum= scanner.next();
       String regex ="[,\\.]";
       String[] newString= new String[]{Arrays.toString(Datum.split(regex))};
       String alwaysnew=(newString[0]);
       String nevernew=alwaysnew.substring(11, 13 );
        String neverneww=alwaysnew.substring(9, 11 );
        String nevernewor=alwaysnew.substring(5,7);
        String neverneworalways=alwaysnew.substring(1, 3 );
       int firstnum=Integer.parseInt(nevernew);
int fouthnum=Integer.parseInt(nevernewor);
int sixthnum=Integer.parseInt(neverneww);

       double secondnum=Math.floor(firstnum/4);
       double thirdnum=secondnum+firstnum ;


        System.out.println(secondnum);
        System.out.println(firstnum);
        System.out.println(nevernew);
        System.out.println(nevernewor);
        System.out.println(neverneworalways);
         System.out.println(alwaysnew);
       double fifthnum = 0;
switch (fouthnum) {
    case 1:

       fifthnum=thirdnum+1;
        break;
    case 2:
        fifthnum=thirdnum+4;
        break;
    case 3:
        fifthnum=thirdnum+4;
        break;
    case 4:
        fifthnum=thirdnum;
        break;
    case 5:
        fifthnum=thirdnum+2;
        break;
    case 6:
        fifthnum=thirdnum+5;
        break;
    case 7:
        fifthnum=thirdnum;
        break;
    case 8:
        fifthnum=thirdnum+3;
        break;
    case 9:
        fifthnum=thirdnum+6;
        break;
    case 10:
        fifthnum=thirdnum+1;
        break;
    case 11:
        fifthnum=thirdnum+4;
        break;
    case 12:
        fifthnum=thirdnum+6;
        break;

}

double lastnum=0;
switch (sixthnum){

    case 18:
         lastnum=fifthnum+2;
         break;

    case 20:
        lastnum=fifthnum+6;
break;

    case 21:
    lastnum=fifthnum+4;
    break;


}

        double seriouslylastnum=lastnum%7;
        System.out.println(seriouslylastnum);

    }
}