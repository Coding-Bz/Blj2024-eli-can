import java.util.ArrayList;
import java.util.Arrays;

class TaskLeet {
    private int RealValue;
    private int Value;

    public TaskLeet(int RealValue, int Value){
        this.RealValue = RealValue;
        this.Value = Value;
    }

    public double[] medianSlidingWindow(int[] nums, int k) {
        ArrayList<TaskLeet> mySet = new ArrayList<>();
        ArrayList<Integer> onlyA = new ArrayList<>();

        // Korrigierte Schleife für Sliding Window
        for (int l = 0; l <= nums.length - k; l++) {
            mySet.clear(); // Wichtig: Liste leeren für neues Fenster

            int wholeNum = 0;
            for (int a = l; a < l + k; a++) {
                wholeNum += nums[a];
            }

            int average = wholeNum / k;

            for (int a = l; a < l + k; a++) {
                int Value = average - nums[a];
                TaskLeet tl = new TaskLeet(nums[a], Value);
                mySet.add(tl);
            }

            int maxDiff = mySet.get(0).Value;
            int RealV = mySet.get(0).RealValue;

            for (int y = 1; y < mySet.size(); y++) {
                if (mySet.get(y).Value > maxDiff) {
                    maxDiff = mySet.get(y).Value;
                    RealV = mySet.get(y).RealValue;
                }
            }

            onlyA.add(RealV);
        }

        double[] myArray = new double[onlyA.size()];
        for (int q = 0; q < myArray.length; q++) {
            myArray[q] = onlyA.get(q);
        }

        return myArray;
    }

    public int getRealValue() {
        return RealValue;
    }

    public int getValue() {
        return Value;
    }

}
