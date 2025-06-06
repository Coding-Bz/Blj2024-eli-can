import java.util.ArrayList;

public class SortingFunction {

    static ArrayList<Integer> finalList = new ArrayList<>(10);
    static int check = 0;
    static int maxNum = 0;
    static int maxIndex = 0;

    public ArrayList<Integer> sortingArray(ArrayList<Integer> myList) {

        if (myList.size() == 0) {
            System.out.println("Empty list no sorting");
            return null;
        } else if (myList.size() == 1) {
            finalList.add(myList.get(0));
            System.out.println(myList.get(0));
            return finalList;
        }

        if (check < myList.size()) {
            if (maxNum < myList.get(check)) {
                maxNum = myList.get(check);
                maxIndex = check;
            }
            check++;
            sortingArray(myList);
        }

        if (check >= myList.size()) {
            finalList.add(maxNum);
            System.out.println(maxNum);
            myList.remove(maxIndex);
            check = 0;
            maxNum = 0;
            sortingArray(myList);
        }

        return finalList;
    }
}
