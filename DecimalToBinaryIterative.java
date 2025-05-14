public class DecimalToBinaryIterative {
    public static String toBinary(int n) {
        if (n == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n = n / 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println("Binary of 13: " + toBinary(13));
    }
}
