public class Divider {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException();
        }else return a / b;
    }
}
