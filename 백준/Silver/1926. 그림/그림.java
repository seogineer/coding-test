import java.util.*;
public class Main {
  static int n;
  static int m;
  static int[] dx = {1, -1, 0, 0};
  static int[] dy = {0, 0, 1, -1};
  static int[][] map;
  static boolean[][] visit;
  static int count = 0;
  static int maxArea = 0;
  static Queue<Coordinate> queue = new LinkedList<>();
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    map = new int[n][m];
    visit = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        map[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (map[i][j] == 1 && !visit[i][j]) {
          count++;
          visit[i][j] = true;
          bfs(j, i);
        }
      }
    }

    System.out.println(count);
    System.out.println(maxArea);
    sc.close();
  }

  static void bfs(int x, int y) {
    int area = 1;
    queue.add(new Coordinate(x, y));
    while(!queue.isEmpty()) {
      Coordinate coordinate = queue.poll();
      int coordinateX = coordinate.x;
      int coordinateY = coordinate.y;
      for(int i = 0; i < 4; i++) {
        int nx = coordinateX + dx[i];
        int ny = coordinateY + dy[i];
        if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
          if (map[ny][nx] == 1 && !visit[ny][nx]) {
            area++;
            visit[ny][nx] = true;
            queue.add(new Coordinate(nx, ny));
          }
        }
      }
    }
    maxArea = Math.max(maxArea, area);
  }
}

class Coordinate {
  int x;
  int y;
  protected Coordinate (int x, int y) {
    this.x = x;
    this.y = y;
  }
}