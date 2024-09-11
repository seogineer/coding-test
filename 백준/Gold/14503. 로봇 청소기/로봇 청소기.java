import java.util.*;
public class Main {
    static int count = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();
         int M = sc.nextInt();
         int x = sc.nextInt();
         int y = sc.nextInt();
         int d = sc.nextInt();

         int[][] map = new int[N][M];

         for(int i = 0; i < N; i++) {
             for (int j = 0; j < M; j++) {
                 map[i][j] = sc.nextInt();
             }
         }

         while(true) {
             if(map[x][y] == 0) {
                 count++;
                 map[x][y] = 2;
             }

             boolean moved = false;

             for(int i = 0; i < 4; i++) {
                 d = (d + 3) % 4;
                 int nx = x + dx[d];
                 int ny = y + dy[d];
                 if (ny >= 0 && ny < M && nx >= 0 && nx < N) {
                     if (map[nx][ny] == 0) {
                         moved = true;
                         x = nx;
                         y = ny;
                         break;
                     }
                 }
             }

             if (!moved) {
                 int bd = (d + 2) % 4;
                 int bx = x + dx[bd];
                 int by = y + dy[bd];
                 if (by >= 0 && by < M && bx >= 0 && bx < N) {
                     if (map[bx][by] == 1) {
                         break;
                     } else {
                         x = bx;
                         y = by;
                     }
                 }
             }
         }

         System.out.println(count);
         sc.close();
    }
}
