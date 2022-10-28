import java.util.Scanner;

public class Main { // 연속합
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        int[] temp = new int[n];
        int max = 0;
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        temp[0] = arr[0];
        max = arr[0];
        
        for(int i = 1; i < n; i++) {
            temp[i] = Math.max(arr[i], arr[i] + temp[i - 1]);
            max = Math.max(max, temp[i]);
        }
        
        System.out.println(max);
        
        sc.close();
    }
}