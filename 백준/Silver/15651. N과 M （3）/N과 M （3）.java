import java.util.*;
class Main {
    static int N;
    static int M;
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        
        result = new int[M];
        
        backTrack(0);
        System.out.println(sb.toString());
        sc.close();
    }
    
    private static void backTrack(int depth) {
        if (depth == M) {
            for (int rs : result) {
                sb.append(rs + " ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = 1; i <= N; i++) {
            result[depth] = i;
            backTrack(depth + 1);
        }
    }
}