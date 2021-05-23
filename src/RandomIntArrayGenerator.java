public class RandomIntArrayGenerator {

    private int min;
    private int max;

    public RandomIntArrayGenerator (int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int[] generate (int size) {
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
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
