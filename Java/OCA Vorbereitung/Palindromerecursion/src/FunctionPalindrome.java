public class FunctionPalindrome {


    public boolean isPalindrome(String word,int low, int high){

        char[]myArray=word.toCharArray();
if (word.isEmpty()){
    System.out.println("Not a palindrome");
    return false;
} else if (low==high) {
    return true;
} else if (myArray[low]==myArray[high]) {
    int newLow=low+1;
    int newHigh=high-1;
    isPalindrome(word,newLow,newHigh);

} else if (myArray[low]!=myArray[high]) {
    return false;
}

        return true;
    }
}
