import java.util.*;
public class Main {
  public static final int[] dx = new int[]{1, -1, 0, 0};
  public static final int[] dy = new int[]{0, 0, -1, 1};
  public static int n;
  public static int m;
  public static int area = 0;
  public static int count = 0;
  public static int[][] arr;
  public static boolean[][] isVisit;
  public static Queue<Coordinate> q = new LinkedList<Coordinate>();

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    m = sc.nextInt();
    arr = new int[n][m];
    isVisit = new boolean[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    for (int y = 0; y < n; y++) {
      for (int x = 0; x < m; x++) {
        if (arr[y][x] == 1 && !isVisit[y][x]) {
          isVisit[y][x] = true;
          count++;
          bfs(x, y);
        }
      }
    }
    
    System.out.println(count);
    System.out.println(area);
    sc.close();
  }

  public static void bfs(int x, int y) {
    int localArea = 1;
    q.add(new Coordinate(x, y));
    while (!q.isEmpty()) {
      Coordinate coordinate = q.poll();
      for (int i = 0; i < 4; i++) {
        int coX = coordinate.getX() + dx[i];
        int coY = coordinate.getY() + dy[i];
        if (0 <= coX && m > coX && 0 <= coY && n > coY) {
          if (arr[coY][coX] == 1 && !isVisit[coY][coX]) {
            localArea++;
            isVisit[coY][coX] = true;
            q.add(new Coordinate(coX, coY));
          }
        }
      }
    }
    area = Math.max(area, localArea);
  }
}

class Coordinate {
  private int x;
  private int y;

  public Coordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX () {
    return x;
  }

  public int getY() {
    return y;
  }
}