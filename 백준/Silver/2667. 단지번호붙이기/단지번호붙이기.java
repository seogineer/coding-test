import java.util.*;
public class Main {
  static int N;
  static int[][] map;
  static boolean[][] visit;
  static ArrayList<Integer> result = new ArrayList<>();
  static int each;
  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0, 0, 1, -1};
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    map = new int[N][N];
    visit = new boolean[N][N];

    for (int i = 0; i < N; i++) {
      String[] input = sc.next().split("");
      for (int j = 0; j < input.length; j++) {
        map[i][j] = Integer.parseInt(input[j]);
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (map[i][j] == 1 && !visit[i][j]) {
          each = 0;
          visit[i][j] = true;
          dfs(j, i);
          result.add(each);
        }
      }
    }

    System.out.println(result.size());
    Collections.sort(result);
    for (int each : result) {
      System.out.println(each);
    }
    sc.close();
  }

  static void dfs(int x, int y) {
    each++;
    for(int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
        if (map[ny][nx] == 1 && !visit[ny][nx]) {
          visit[ny][nx] = true;
          dfs(nx, ny);
        }
      }
    }
  }
}