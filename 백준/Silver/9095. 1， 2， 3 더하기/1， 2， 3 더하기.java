import java.util.*;
class Main {
    private static int methodCount;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 0; t < tc; t++){
            int n = sc.nextInt();
            methodCount = 0;
            getSumMethodCount(n, 0);
            System.out.println(methodCount);
        }
        sc.close();
    }

    private static void getSumMethodCount(int n, int sum) {
        if(n <= sum){
            if(n == sum){
                methodCount++;    
            }
            return;
        }
        getSumMethodCount(n, sum + 1);
        getSumMethodCount(n, sum + 2);
        getSumMethodCount(n, sum + 3);
    }
}