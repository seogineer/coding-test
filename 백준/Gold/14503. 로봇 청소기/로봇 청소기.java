import java.util.*;
public class Main {
  static int[] dy = {-1, 0, 1, 0};
  static int[] dx = {0, 1, 0, -1};
  static int count = 0;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int y = sc.nextInt();
    int x = sc.nextInt();
    int d = sc.nextInt();
    
    int[][] map = new int[N][M];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        map[i][j] = sc.nextInt();
      }
    }
    
    while (true) {
      if (map[y][x] == 0) {
        map[y][x] = 2;
        count++;
      }
      boolean sw = false;
      
      for (int i = 0; i < 4; i++) {
        d = (d + 3) % 4;
        int nx = x + dx[d];
        int ny = y + dy[d];
        
        if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
          if (map[ny][nx] == 0) {
            y = ny;
            x = nx;
            sw = true;
            break;
          }
        }
      }

      if (!sw) {
        int nx = x - dx[d];
        int ny = y - dy[d];
        
        if (map[ny][nx] == 1) {
          break;
        } else {
          y = ny;
          x = nx;
        }
      }
    }

    System.out.println(count);
    sc.close();
  }
}