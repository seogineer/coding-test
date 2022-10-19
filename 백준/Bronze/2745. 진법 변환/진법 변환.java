import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int B = sc.nextInt();

        int result = 0;
        int power = 0;
        for(int i = N.length() - 1; i >= 0; i--){
            if(N.charAt(i) >= '0' && N.charAt(i) <= '9'){
                result += (N.charAt(i) - '0') * Math.pow(B, power);
                power++;
                continue;
            }
            if(N.charAt(i) >= 'A' && N.charAt(i) <= 'Z'){
                result += ((int) N.charAt(i) - 55) * Math.pow(B, power);
                power++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}