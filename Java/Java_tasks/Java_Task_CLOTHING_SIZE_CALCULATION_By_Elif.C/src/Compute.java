public class Compute {
 
   
    int length;
    int waist;
    String Gender;

    // Methode (Funktion)
    public void computeGarmentSize() {

        if (Gender.equals("Female")) {
            int Sizeaverage= waist/2-6;
            if (length>170){
                int Sizeoveraverage=Sizeaverage*2;
                System.out.println(Sizeoveraverage);
            } else if (length<170 && length>164) {
                System.out.println(Sizeaverage);
            } else if (length<164) {
                int Sizeunseraverage= Sizeaverage/2;
                System.out.println(Sizeunseraverage);
            }
            else{
                System.out.println("Stop testing my code and write something that makes sense (please)");
            }

        } else if (Gender.equals("Male")) {
            int Sizeaverage= waist/2;
            if (length>181){
                System.out.println(Sizeaverage);
            } else if (length<=181&&length>=174) {
                int Sizeaverageexception= waist/2-6;
                System.out.println(Sizeaverageexception);
            } else if (length<174) {
                int Sizeunseraverage= Sizeaverage/2;
                System.out.println(Sizeunseraverage);
            }
        }
        else {
            System.out.println("Hahaha your checking my code");
        }
    }}
