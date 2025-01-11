import java.util.*;
class Main {
    static int count;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            recur(n, 0);
            System.out.println(count);
            count = 0;
        }
        
        sc.close();
    }
    
    private static void recur(int n, int value) {
        if (value >= n) {
            if (value == n) {
                count++;
            }
            return;
        }
        
        recur(n, value + 1);
        recur(n, value + 2);
        recur(n, value + 3);
    }
}