import java.util.Scanner;

// https://www.acmicpc.net/problem/1309
// dp문제 점화식을 사용 dp[n] = 2*dp[n-1] + dp[n-2]
public class P1309 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        int[] arr = new int[100001];
        arr[1] = 3;
        arr[2] = 7;
        arr[3] = 17;
        if (arr[N] == 0) {
            for (int i = 4; i < N + 1; i++) {
                arr[i] = 2 * arr[i - 1] % 9901 + arr[i - 2] % 9901;
            }
        }
        System.out.println(arr[N]%9901);
    }
}
