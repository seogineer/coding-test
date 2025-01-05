import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int targetChannel = sc.nextInt();
        int brokenCount = sc.nextInt();
        boolean[] brokenNumbers = new boolean[10];
        
        for (int i = 0; i < brokenCount; i++) {
            int brokenNumber = sc.nextInt();
            brokenNumbers[brokenNumber] = true;
        }
        
        int minProcess = Math.abs(targetChannel - 100);
        
        for (int i = 0; i <= 999999; i++) {
            String channel = String.valueOf(i);
            
            boolean isValid = true;
            for (char c : channel.toCharArray()) {
                if (brokenNumbers[c - '0']) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                int process = channel.length() + Math.abs(i - targetChannel);
                minProcess = Math.min(minProcess, process);
            }
        }
        
        System.out.println(minProcess);
        
        sc.close();
    }
}