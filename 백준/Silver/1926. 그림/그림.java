import java.util.*;
public class Main {
    static int[] dy = {0, 1, 0, -1};
    static int[] dx = {1, 0, -1, 0};
    static int count = 0;
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] map = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                map[j][i] = sc.nextInt();
            }
        }

        Queue<Coordinate> q = new LinkedList<>();

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (map[j][i] == 1 && !visited[j][i]) {
                    count++;
                    visited[j][i] = true;
                    int area = 1;
                    q.add(new Coordinate(j, i));
                    while (!q.isEmpty()) {
                        Coordinate co = q.poll();
                        for (int k = 0; k < 4; k++) {
                            int ny = co.y + dy[k];
                            int nx = co.x + dx[k];
                            if (ny >= 0 && ny < n && nx >= 0 && nx < m) {
                                if(map[ny][nx] == 1 && !visited[ny][nx]) {
                                    area++;
                                    visited[ny][nx] = true;
                                    q.add(new Coordinate(ny, nx));
                                }
                            }
                        }
                    }
                    max = Math.max(area, max);
                }
            }
        }

        System.out.println(count);
        System.out.println(max);
        sc.close();
    }

    static class Coordinate {
        int x;
        int y;

        Coordinate (int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}
