import java.util.*;
class Main {
    public static void main(String[] args) {
        char[] ch = {'A', 'B', 'C', 'D', 'E', 
                     'F', 'G', 'H', 'I', 'J', 
                     'K', 'L', 'M', 'N', 'O', 
                     'P', 'Q', 'R', 'S', 'T', 
                     'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int B = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            int rest = (int) (N % B);
            N /= B;
            if(rest >= 10 && rest <= 35){
                sb.insert(0, ch[rest - 10]);
                continue;
            }
            sb.insert(0, rest);
        }
        System.out.println(sb);
        sc.close();
    }
}