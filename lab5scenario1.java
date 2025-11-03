public class lab5scenario1 {
    public static int sumDigits(int n) {
        if (n < 10) {
            return (n);
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        System.out.print(sumDigits(34));
    }
}
