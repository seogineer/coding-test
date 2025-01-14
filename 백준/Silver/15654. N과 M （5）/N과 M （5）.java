import java.util.*;
class Main {
    static int N, M;
    static int[] result;
    static boolean[] visited = new boolean[10001];
    static List<Integer> nums = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        M = sc.nextInt();
        
        result = new int[M];
        
        for (int i = 0; i < N; i++) {
            nums.add(sc.nextInt());
        }
        Collections.sort(nums);
        
        backTrack(0);
        sc.close();
    }
    
    private static void backTrack(int depth) {
        if (depth == M) {
            for (int rs : result) {
                System.out.print(rs + " ");
            }
            System.out.println();
            return;
        }
        
        for (int num : nums) {
            if (!visited[num]) {
                visited[num] = true;
                result[depth] = num;
                backTrack(depth + 1);
                visited[num] = false;
            }
        }
    }
}