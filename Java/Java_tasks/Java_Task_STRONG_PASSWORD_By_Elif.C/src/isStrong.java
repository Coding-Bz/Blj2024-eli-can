public class isStrong {


    public static String Passwort;

    public void Strong() {


        int Lengt = Passwort.length();
        boolean einss = false;
        boolean zweii = false;
        boolean dreii = false;
        boolean fuenff = false;
        boolean vierr = false;


        if (Lengt > 7) {

            for (int i = 0; i < Passwort.length(); i++) {
                char c = Passwort.charAt(i);

                if (c >= 97 && c <= 122) {
                    einss = true;
                }

                //eins = charList.contains(((int) c >= 97 && (int) c <= 122));
                if (c >= 65 && c <= 90) {
                    dreii = true;
                }
                //drei ==charList.contains(((int) c >= 65 && (int) c <= 90));

                if (c >= 48 && c <= 57) {
                    zweii = true;
                }

                if (c == '!') {
                    vierr = true;
                }
                if (c == '*') {
                    fuenff = true;
                }


            }

            if (einss && zweii && dreii && (vierr||fuenff) ) {
                System.out.println("Passwort:Gut!");
            } else {
                System.out.println("Passwort:Schlecht!!!");
            }


        } else {
            System.out.println("Passwort:Schlecht!");
        }
    }
}



