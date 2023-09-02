public class Arithmetic {
    private int num1;
    private int num2;

    public Arithmetic(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getSum() {
        return num1 + num2;
    }

    public int getMultiplication() {
        return num1 * num2;
    }

    public int getMax() {
        return Math.max(num1, num2);
    }

    public int getMin() {
        return Math.min(num1, num2);
    }

}
