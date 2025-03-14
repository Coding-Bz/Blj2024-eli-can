import java.io.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> allValues = new HashMap<>();
        File file = new File("C:\\Blj2024-eli-can\\Java-Challenges\\essaySearcher\\src\\script.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = "";
        String line;


        while ((line = br.readLine()) != null) {

            st = st + line;


        }
        ArrayList<String> words = essaycontroll(st);
        System.out.println(words.size());
        System.out.println(words);
        for (String valueCounting : words) {
            allValues.put(valueCounting, allValues.getOrDefault(valueCounting, 0) + 1);

        }
        findthmostFrequentword(allValues);
        findthmostFrequentword(allValues);
        String theword = findthmostFrequentword(allValues);
        String name=listmaker(allValues);
        filemaker(words, theword,allValues, name);

    }


    public static ArrayList essaycontroll(String essay) {
        String name = "";
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i <= essay.length() - 1; i++) {
            if (essay.charAt(i) == ' ') {
                if (essay.charAt(i + 1) == ' ') {
                    i = i + 1;
                }
                words.add(name);
                name = "";

            }
            if (essay.charAt(i) != ' ') {

                int value = essay.charAt(i);
                if ((value >= 65 && value <= 90) || (value >= 97 && value <= 122) || (value >= 196 && value <= 252) || value == 223) {
                    name = name + essay.charAt(i);
                }
            }

        }
        return words;
    }


    public static String findthmostFrequentword(HashMap<String, Integer> allValues) {

        String Theword = "";
        int max = 0;
        for (Map.Entry<String, Integer> entry : allValues.entrySet()) {

            String word = entry.getKey();
            int count = entry.getValue();

            if (count > max) {
                max = count;
                Theword = word;

            }

        }



        return Theword;

    }



    public static String listmaker(HashMap<String, Integer> wordCountMap) {
        StringBuilder list = new StringBuilder();

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            list.append("\n").append(entry.getKey()).append(": ").append(entry.getValue());
        }

        return list.toString();
    }









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
            myWriter.write("[ "+LocalDate.now() +" " +LocalTime.now()+ " ] [filename.txt]"+"\n"+"_____________________________________________________"+"\n"+"They are total of: "+words.size()+" words" +"\n"+"And they are: "+ hellooamericaa.size()+"\n"+"The most common word is: "+Theword+"\n"+"____________________________________________________________"
                    +"\n"+name );
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}






