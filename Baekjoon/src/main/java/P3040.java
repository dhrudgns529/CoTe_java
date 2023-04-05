import java.util.Scanner;

public class P3040 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0; i<9; i++){
            arr[i] = in.nextInt();
        }
        int sum = -100;

        for(int i=0; i<9; i++){
            sum += arr[i];
        }

        int notNonJaeng1 = 0;
        int notNonJaeng2 = 0;

        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if (arr[i] + arr[j] == sum){
                    notNonJaeng1 = arr[i];
                    notNonJaeng2 = arr[j];
                }
            }
        }

        for(int i=0; i<9; i++){
            if(arr[i] != notNonJaeng1 && arr[i] != notNonJaeng2) {
                System.out.println(arr[i]);
            }
        }
    }
}
