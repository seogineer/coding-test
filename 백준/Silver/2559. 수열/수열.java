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

        int current = 0;
        for (int i = 0; i < K; i++) {
            current += arr[i];
        }

        int max = current;
        for (int i = K; i < N; i++) {
            current = current + arr[i] - arr[i - K];
            max = Math.max(max, current);
        }

        System.out.println(max);
        sc.close();
    }
}
