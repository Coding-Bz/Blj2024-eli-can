public class SearchFunction {


    public boolean searchAlg(int low, int[]myList, int sol){
        if(myList.length==0){
            System.out.println("Nothing to search for!");
            return false;
        } else if (myList[low]!=sol) {
            low++;
            searchAlg(low,myList,sol);
        }
        else { System.out.println("The number was found at the index of: "+low);
            return true;}

return true;
    }
}
