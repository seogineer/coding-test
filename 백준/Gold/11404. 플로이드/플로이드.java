/*
*
*/

import java.util.*;
public class Main {
    static int INF = 100000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] dist = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == j) {
                    dist[i][j] = 0;
                } else {
                    dist[i][j] = INF;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            dist[u][v] = Math.min(dist[u][v], w);
        }

        for (int k = 1; k <= n; k++) {
            for (int j = 1; j <= n; j++) {
                for (int i = 1; i <= n; i++) {
                    if (dist[j][i] > dist[j][k] + dist[k][i]) {
                        dist[j][i] = dist[j][k] + dist[k][i];
                    }
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(dist[i][j] == INF) {
                    System.out.print("0 ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
