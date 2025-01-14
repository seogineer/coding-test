import java.util.*;
class Main {
    static int N, M;
    static int[] numbers;
    static int[] selected;
    static int[] result;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        numbers = new int[N];
        selected = new int[M];
        result = new int[M];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        
        backTrack(0, 0);
        sc.close();
    }
    
    private static void backTrack(int start, int depth) {
        if (depth == M) {
            for (int rs : result) {
                System.out.print(rs + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = start; i < N; i++) {
            result[depth] = numbers[i];
            backTrack(i + 1, depth + 1);
        }
    }
}