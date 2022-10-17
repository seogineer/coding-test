import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int tc = 0; tc < n; tc++) {
            arr[tc] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                continue;
            }
            boolean flag = false;  // 소수X => true, 소수O => false
            for(int j = 2; j < arr[i]; j++) {
                if(arr[i] % j == 0) { // 1과 자기자신 이외에 수로 나눠서 나머지가 0이면 소수가 아니다.
                    flag = true;
                    break;
                }
            }
            if(flag == false) {
                count++;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}