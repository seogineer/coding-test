import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long sum = 0;
        int length = 1;
        int start = 1;
        
        while (start <= N) {
            int end = start * 10 - 1;
            if (end > N) {
                end = N;
            }
            sum += (long) ((end - start) + 1) * length;
            length++;
            start *= 10;
        }
        
        System.out.println(sum);
        sc.close();
    }
}