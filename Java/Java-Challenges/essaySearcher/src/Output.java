import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Output {

    public static void filemaker(ArrayList<String> words, String Theword, HashMap<String, Integer> hellooamericaa, String name) {

        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("[ "+ LocalDate.now() +" " + LocalTime.now()+ " ] [filename.txt]"+"\n"+"_____________________________________________________"+"\n"+"They are total of: "+words.size()+" words" +"\n"+"And they are: "+ hellooamericaa.size()+"\n"+"The most common word is: "+Theword+"\n"+"____________________________________________________________"
                    +"\n"+name );
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }



}
