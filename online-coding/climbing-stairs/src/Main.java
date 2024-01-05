public class Main {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        var v1 = 1;
        var v2 = 1;
        for (int i = 0; i < n - 1; i++) {
            var tmp = v1;
            v1 = v1 + v2;
            v2 = tmp;
        }
        return v1;
    }
}