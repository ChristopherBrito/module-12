public class DecimalToBinaryRecursive {
    public static String toBinary(int n) {
        if (n == 0) return "";
        return toBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int number = 13;
        String binary = toBinary(number);
        System.out.println("Binary of " + number + ": " + (binary.isEmpty() ? "0" : binary)); // Output: 1101
    }
}
