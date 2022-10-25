import java.util.*;
class Main {
    static long[][] stairs;
    static boolean[][] visited;
    final static long MOD = 1000000000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        stairs = new long[N + 1][10];
        visited = new boolean[N + 1][10];
        
        for(int i = 0; i < 10; i++){
            stairs[1][i] = 1L;
            visited[1][i] = true;
        }
        
        long result = 0;
        for(int i = 1; i <= 9; i++){
            result += recursion(N, i);
        }
        System.out.println(result % MOD);
        
        sc.close();
    }

    static long recursion(int length, int number){
        if(length == 1){
            return stairs[length][number];
        }

        if(!visited[length][number]){
            if (number == 0) {
                stairs[length][number] = recursion(length - 1, 1);
                visited[length][number] = true;
            } else if (number == 9) {
                stairs[length][number] = recursion(length - 1, 8);
                visited[length][number] = true;
            } else {
                stairs[length][number] = recursion(length - 1, number - 1) + recursion(length - 1, number + 1);
                visited[length][number] = true;
            }
        }
        
        return stairs[length][number] % MOD;
    }
}