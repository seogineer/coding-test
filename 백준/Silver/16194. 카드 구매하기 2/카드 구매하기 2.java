import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] P = new int[N + 1];
        for(int t = 1; t <= N; t++){
            P[t] = sc.nextInt();
        }

        int[] minPrice = new int[N + 1];
        for(int i = 1; i <= N; i++){
            minPrice[i] = 10001;
        }
        
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                minPrice[i] = Math.min(minPrice[i], minPrice[i - j] + P[j]);
            }
        }

        System.out.println(minPrice[N]);
        sc.close();
    }
}