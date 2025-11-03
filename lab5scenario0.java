public class lab5scenario0 {
    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 6;
        int result = factorial(n);
        System.out.println(factorial(n));
    }
}

