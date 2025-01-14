import java.util.*;
class Main {
    static int N, M;
    static int[] result;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        
        result = new int[M];
        
        backTrack(1, 0);
        sc.close();
    }
    
    static void backTrack(int start, int depth) {
        if (depth == M) {
            for (int rs : result) {
                System.out.print(rs + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = start; i <= N; i++) {
            result[depth] = i;
            backTrack(i, depth + 1);
        }
    }
}