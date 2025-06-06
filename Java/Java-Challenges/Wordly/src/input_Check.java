public class input_Check {
    public static void imputCheck(String userAnswer,String Word){

        int i = 0;
        System.out.println();
        while (i < 5) {

            String wordFeedback = "";


            if (userAnswer.toUpperCase().charAt(i) == Word.toUpperCase().charAt(i)) {
                wordFeedback = "\u001B[32m" + userAnswer.charAt(i) + "\u001B[0m";
                System.out.print(wordFeedback);
                i++;
            } else if (Word.toUpperCase().contains(String.valueOf(userAnswer.toUpperCase().charAt(i)))) {
                wordFeedback = "\u001B[33m" + userAnswer.charAt(i) + "\u001B[0m";
                System.out.print(wordFeedback);
                i++;
            } else {
                wordFeedback = "\u001B[31m" + userAnswer.charAt(i) + "\u001B[0m";
                System.out.print(wordFeedback);
                i++;
            }

        }
        System.out.println();




    }
}
