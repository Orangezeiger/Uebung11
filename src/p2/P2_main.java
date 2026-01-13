package p2;

public class P2_main {
    public static void main(String[] args) {
        System.out.println(recLog(16));
        System.out.println(recLog(1));
        System.out.println(iterLog(16));
        System.out.println(iterLog(1));
    }

    public static int recLog(int a) {
        if (a == 1) return 0;
        return 1 + recLog(a / 2);
    }

    public static int iterLog(int a) {
        if (a == 0) return 0;
        int cnt = 0;
        while (a != 1) {
            a = a / 2;
            cnt++;
        }
        return cnt;
    }
}
