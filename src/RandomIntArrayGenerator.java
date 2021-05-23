//This class generates a random int array from min - max
public class RandomIntArrayGenerator {

    //minimum value for int
    private int min;
    //max value for int
    private int max;

    //constructor
    public RandomIntArrayGenerator (int min, int max) {
        this.min = min;
        this.max = max;
    }

    //this method generates an int array of size "size" and returns the int array
    public int[] generate (int size) {
        int[] numbers = new int[size];

        //loop for size times
        for (int i = 0; i < size; i++) {
            //generate random number within the constraints
            numbers[i] = (int) (Math.random() * (max-min+1)) + min;
        }

        return numbers;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
