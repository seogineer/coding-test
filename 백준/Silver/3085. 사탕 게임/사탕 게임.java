import java.util.*;
public class Main {
    static String[][] arr;
    static int N;
    static int max = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new String[N][N];
        for (int i = 0; i < N; i++) {
            String[] row = sc.next().split("");
            for (int j = 0; j < N; j++) {
                arr[i][j] = row[j];
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    swap(i, j, i, j + 1);
                    scan();
                    swap(i, j, i, j + 1);
                }
                if(i + 1 < N) {
                    swap(i, j, i + 1, j);
                    scan();
                    swap(i, j, i + 1, j);
                }
            }
        }

        System.out.println(max);
        sc.close();
    }

    static void swap(int x1, int y1, int x2, int y2) {
        String temp = arr[x1][y1];
        arr[x1][y1] = arr[x2][y2];
        arr[x2][y2] = temp;
    }

    static void scan() {
        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (arr[i][j].equals(arr[i][j - 1])) {
                    count++;
                    max = Math.max(max, count);
                    continue;
                }
                count = 1;
                max = Math.max(max, count);
            }
        }

        for (int i = 0; i < N; i++) {
            int count = 1;
            for (int j = 1; j < N; j++) {
                if (arr[j][i].equals(arr[j - 1][i])) {
                    count++;
                    max = Math.max(max, count);
                    continue;
                }
                count = 1;
                max = Math.max(max, count);
            }
        }
    }
}
