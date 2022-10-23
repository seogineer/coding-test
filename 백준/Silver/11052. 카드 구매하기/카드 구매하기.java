import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] P = new int[N + 1];
        for(int p = 1; p <= N; p++){
            P[p] = sc.nextInt();
        }

        int[] maxPrice = new int[N + 1];
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                maxPrice[i] = Math.max(maxPrice[i], maxPrice[i - j] + P[j]);
            }
        }
        
        System.out.println(maxPrice[N]);
        sc.close();
    }
}