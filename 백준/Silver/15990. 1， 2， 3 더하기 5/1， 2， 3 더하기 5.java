import java.util.*;
class Main {
    public static void main(String[] args) {
        long[][] method = new long[100001][4];
        method[1][1] = 1;
        method[2][2] = 1;
        method[3][1] = 1;
        method[3][2] = 1;
        method[3][3] = 1;

        for(int i = 4; i <= 100000; i++){
            method[i][1] = (method[i - 1][2] + method[i - 1][3]) % 1000000009;
            method[i][2] = (method[i - 2][1] + method[i - 2][3]) % 1000000009;
            method[i][3] = (method[i - 3][1] + method[i - 3][2]) % 1000000009;
        }
        
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int tc = 0; tc < T; tc++){
            int n = Integer.parseInt(sc.nextLine());
            System.out.println((method[n][1] + method[n][2] + method[n][3]) % 1000000009);
        }
        sc.close();
    }
}