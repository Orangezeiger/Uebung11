package h2;

public class H2_main {

    public static int[] fibonacci = new int[1000];

    public static void main(String[] args) {
        benchmark(40);
    }

    public static void benchmark(int n) {
        long a = System.nanoTime();
        System.out.println("Zahl: " + fibonacci(n));
        long b = System.nanoTime();
        System.out.println("Elapsed nanoseconds fibonacci: " + (b - a));

        System.out.println("\n");

        long c = System.nanoTime();
        System.out.println("Zahl: " + fibonacciCached(n));
        long d = System.nanoTime();
        System.out.println("Elapsed nanoseconds fibonacciCached : " + (d - c));

        System.out.println("\n");

        long e = System.nanoTime();
        System.out.println("Zahl: " + fibonacciIterativ(n));
        long f = System.nanoTime();
        System.out.println("Elapsed nanoseconds fibonacciIterativ : " + (f - e));

        System.out.println("\n");
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int fibonacciCached(int n) {
        if (fibonacci[n] != 0) {
            return fibonacci[n];
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            fibonacci[1] = 1;
            return 1;
        } else {
            int zahl = fibonacciCached(n - 1);
            int zahl2 = fibonacciCached(n - 2);
            fibonacci[n] = zahl + zahl2;
            return fibonacci[n];
        }
    }

    public static int fibonacciIterativ(int n) {
        int zahl1 = 0;
        int zahl2 = 1;
        for (int i = 0; i < n; i++) {
            int hilf = zahl2;
            zahl2 = zahl1 + zahl2;
            zahl1 = hilf;
        }
        return zahl1;
    }

}
