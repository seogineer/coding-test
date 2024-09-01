import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        for (int n = 0; n <= N - K; n++) {
            int temp = 0;
            for (int k = n; k < n + K; k++) {
                temp += arr[k];
            }
            max = Math.max(max, temp);
        }

        System.out.println(max);
        sc.close();
    }
}
