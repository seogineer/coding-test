import java.util.*;
public class Main {
    static int N;
    static int M;
    static int[] selected;
    static boolean[] used;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        
        selected = new int[M];
        used = new boolean[N + 1];
        
        backTrack(0);
        
        sc.close();
    }
    
    static void backTrack(int depth) {
        if (depth == M) {
            for(int val : selected) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }
        
        for(int i = 1; i <= N; i++) {
            if(!used[i]) {
                used[i] = true;
                selected[depth] = i;
                backTrack(depth + 1);
                used[i] = false;
            }
        }
    }
}
