package p1;

public class P1_main {
    public static void main(String[] args) {
        System.out.println(powRec(2, 20));
        System.out.println(powIter(2, 20));
    }

    public static int powRec(int a, int b) {
        if (b == 0) return 1;
        return a * powRec(a, b - 1);
    }

    public static int powIter(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
