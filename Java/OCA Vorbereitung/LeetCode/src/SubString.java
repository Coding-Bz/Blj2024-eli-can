import java.util.ArrayList;

public class SubString {

    public int lengthOfLongestSubstring(String s) {
        ArrayList<Integer>letterList=new ArrayList<>();
        ArrayList<Integer>letterCount=new ArrayList<>();
        int check=0;
        for(int a=0; a<s.length(); a++){
int value=s.charAt(a);
           if (letterList.contains(value)){
               letterCount.add(check);
               check=0;
               letterList.clear();
           }
           else {
               letterList.add(value);
               check++;
           }

        }
        if (check != 0) {
            letterCount.add(check);
        }

        int maxNum=letterCount.get(0);
for (int b=0; b<letterCount.size();b++){
    if (letterCount.get(b)>maxNum){
        maxNum=letterCount.get(b);
    }

}
        System.out.println(maxNum);
    return maxNum;

}

    public static void main(String[] args){
        SubString ss=new SubString();
        ss.lengthOfLongestSubstring("abcabcbb");
    }
}

