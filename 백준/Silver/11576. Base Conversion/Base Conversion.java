import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(sc.nextLine());
        st = new StringTokenizer(sc.nextLine());
        
        int decimal = 0;
        for(int j = m; j > 0; j--){
            int input = Integer.parseInt(st.nextToken());
            decimal += input * Math.pow(A, j - 1);
        }

        StringBuilder sb = new StringBuilder();
        while (decimal != 0) {
            int rest = (int) (decimal % B);
            decimal /= B;
            sb.insert(0, rest + " ");
        }
        System.out.println(sb);
        
        sc.close();
    }
}