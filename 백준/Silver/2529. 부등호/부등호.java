import java.util.*;
class Main {
    static int k;
    static char[] signs;
    static boolean[] visited = new boolean[10];
    static List<String> numbers = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        k = sc.nextInt();
        signs = new char[k];
        
        for (int i = 0; i < k; i++) {
            signs[i] = sc.next().charAt(0);
        }
        
        backtrack("", 0);
        Collections.sort(numbers);
        
        System.out.println(numbers.get(numbers.size() - 1));
        System.out.println(numbers.get(0));
        sc.close();
    }
    
    static void backtrack(String num, int depth) {
        if (depth > k) {
            numbers.add(num);
            return;
        }
        
        for (int i = 0; i < 10; i++) {
            if (!visited[i]) {
                if (depth == 0 || isValid(num.charAt(depth - 1) - '0', i, signs[depth - 1])) {
                    visited[i] = true;
                    backtrack(num + i, depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
    
    static boolean isValid(int left, int right, char sign) {
        if ((sign == '<' && left < right) || (sign == '>' && left > right)) {
            return true;
        }
        return false;
    }
}