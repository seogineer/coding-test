import java.util.*;
class Main {
    static int N, M;
    static int[] numbers;
    static int[] result;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        
        numbers = new int[N];
        result = new int[M];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        
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
        
        for (int num : numbers) {
            result[depth] = num;
            backTrack(depth + 1);
        }
    }
}