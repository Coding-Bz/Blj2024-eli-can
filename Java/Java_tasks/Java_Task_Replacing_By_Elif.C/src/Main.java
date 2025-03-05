import java.util.*;
public class Main {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
String url= scanner.next();
String newurl=url.replace(" " ,"%20").replace("*","%2A").replace("+","%2B").replace(",","%2C")

        .replace("/","%2F").replace(":","%3A").replace(";","%3B")
        .replace("=","%3D").replace("?","%3F");
        System.out.println(newurl);
    }
}