public class Task1 {

//O(n+m) for different arrays in a loop


    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {              //Complexity=O(n)
            return n * factorial(n - 1); //multiplied by n it's a method recursice function () kind of a loop insid eof it
        }
    }

  /*  public void printWithNestedLoopAndDifferentInputs(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) { //Complexity=O(n+m)
                System.out.println("(" + arr1[i] + ", " + arr2[j] + ")");
            }
        }
    }


   /* public void printWithDifferentInputs(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) { //O(n+m)
            System.out.println(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            System.out.println(arr2[j]);
        }
    }
  /*  public void printHalf(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i]); //O(n)
        }
    }
/*    public boolean containsElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {    //O(n)
                return true;
            }
        }
        return false;
    }

   /* public void printFirstFew(int[] arr) { //constant
        for (int i = 0; i < Math.min(arr.length, 5); i++) { //Complexity O(1)
            System.out.println(arr[i]);
        }
    }

   /* public void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) { //Complexity=O(n*n)
                System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    /* public void printAllElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) { //Complexity=O(n)
            System.out.println(arr[i]);
        }
    }
   public void printFirstElement(int[] arr) {
        if (arr.length > 0) {
            System.out.println(arr[0]); //Complexity=O(1)
        }*/
    }

