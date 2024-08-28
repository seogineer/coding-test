import java.util.*;
public class Main {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};
    static int count = 0;
    static List<Integer> counts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N][N];
        for (int j = 0; j < N; j++) {
            String[] input = sc.next().split("");
            for (int i = 0; i < N; i++) {
                map[j][i] = Integer.parseInt(input[i]);
            }
        }
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                if (map[j][i] == 1 && !visited[j][i]) {
                    count++;
                    visited[j][i] = true;
                    dfs(i, j);
                    counts.add(count);
                    count = 0;
                }
            }
        }
        System.out.println(counts.size());
        Collections.sort(counts);
        for (int count : counts) {
            System.out.println(count);
        }
        sc.close();
    }

    static void dfs(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (ny >= 0 && ny < N && nx >= 0 && nx < N) {
                if (map[ny][nx] == 1 && !visited[ny][nx]) {
                    count++;
                    visited[ny][nx] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
}
