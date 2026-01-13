package p3;

public class P3_main {
    public static void main(String[] args) {
     System.out.println(recMult(1004, 1));
    }

    public static int recMult(int capital, int year) {
        if (year == 0) return capital;
        return (int) Math.floor(recMult(capital, year - 1) * 1.05);
    }
}
