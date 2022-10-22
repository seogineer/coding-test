import java.util.*;
class Main {
    private static int minCount = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        oper(X, 0);
        System.out.println(minCount);
        sc.close();
    }
    private static void oper(int X, int count){
        if(isOne(X)){
            minCount = Math.min(minCount, count);
            return;
        }
        if(isGreaterMinCount(minCount, count)){
            return;
        }
        if(isDividableThree(X)){
            oper(divideThree(X), count + 1);    
        }
        if(isDividableTwo(X)){
            oper(divideTwo(X), count + 1);
        }
        oper(minusOne(X), count + 1);
    }
    private static boolean isGreaterMinCount(int minCount, int count){
        return minCount < count;
    }
    private static boolean isOne(int X){
        return X == 1;
    }
    private static boolean isDividableTwo(int X){
        return X % 2 == 0;
    }
    private static boolean isDividableThree(int X){
        return X % 3 == 0;
    }
    private static int divideThree(int X) {
        return X / 3;
    }
    private static int divideTwo(int X) {
        return X / 2;
    }
    private static int minusOne(int X) {
        return X - 1;
    }
}