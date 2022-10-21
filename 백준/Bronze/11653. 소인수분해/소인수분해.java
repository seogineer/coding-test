import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        
        if(input == 1){
            return;
        }
        
        while(!isPrime(input)){
            for(int i = 2; i < input; i++){
                if(isPrime(i) && (input % i == 0)){
                    System.out.println(i);
                    input /= i;
                    break;
                }
            }
        }
        System.out.println(input);
        
        sc.close();
    }

    private static boolean isPrime(int number){
        if(number == 0 || number == 1){
            return false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}