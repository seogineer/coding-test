import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[][] price = new int[N][3];
        
        for(int i = 0; i < price.length; i++){
            for(int j = 0; j < 3; j++){
                price[i][j] = sc.nextInt();
            }
        }
        
        for(int i = 1; i < N; i++){
            price[i][0] += Math.min(price[i - 1][1], price[i - 1][2]);
            price[i][1] += Math.min(price[i - 1][0], price[i - 1][2]);
            price[i][2] += Math.min(price[i - 1][0], price[i - 1][1]);
        }

        System.out.println(Math.min(price[N - 1][0], Math.min(price[N - 1][1], price[N - 1][2])));
        sc.close();
    }
}