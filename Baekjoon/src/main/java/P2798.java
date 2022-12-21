import java.util.Scanner;

// https://www.acmicpc.net/problem/2798
public class P2798 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for (int i=0; i<N; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(bruteForce(arr, N, M));

    }

    static int bruteForce(int[] arr, int N, int M){
        int answer = 0;

        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++){
                for (int k=j+1; k<N; k++){
                    int temp = arr[i] + arr[j] + arr[k];
                    if (temp == M) {
                        return temp;
                    }else if (temp < M && answer < temp) {
                        answer = temp;
                    }
                }
            }
        }
        return answer;
    }
}
