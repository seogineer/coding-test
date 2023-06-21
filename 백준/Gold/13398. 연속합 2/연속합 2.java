import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputCount = inputCount(sc);
        int[] input = inputNumbers(sc, inputCount);

        int[] sumLeft = sumLeftFromInput(input);
        int[] sumRight = sumRightFromInput(input);
        
        System.out.println(findMaxInRemoveCase(sumLeft, sumRight));
        sc.close();
    }

    private static int findMaxInRemoveCase(int[] sumLeft, int[] sumRight){
        int max = Arrays.stream(sumLeft).max().getAsInt();
        for(int i = 1; i < sumLeft.length - 1; i++){
            max = Math.max(max, sumLeft[i - 1] + sumRight[i + 1]);
        }
        return max;
    }
    
    private static int[] sumRightFromInput(int[] input){
        int[] sumRight = new int[input.length];
        sumRight[input.length - 1] = input[input.length - 1];
        for(int i = sumRight.length - 2; i >= 0; i--){
            sumRight[i] = Math.max(input[i], sumRight[i + 1] + input[i]);
        }
        return sumRight;
    }
    
    private static int[] sumLeftFromInput(int[] input){
        int[] sumLeft = new int[input.length];
        sumLeft[0] = input[0];
        for(int i = 1; i < sumLeft.length; i++) {
            sumLeft[i] = Math.max(input[i], sumLeft[i - 1] + input[i]);
        }
        return sumLeft;
    }
    
    private static int inputCount(Scanner scanner){
        return scanner.nextInt();
    }

    private static int[] inputNumbers(Scanner scanner, int inputCount){
        int[] input = new int[inputCount];
        for(int i = 0; i < inputCount; i++){
            input[i] = scanner.nextInt();
        }
        return input;
    }
}