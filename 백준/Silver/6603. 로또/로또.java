import java.util.*;
class Main {
    static int k;
    static int[] S;
    static List<Integer> list;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            k = sc.nextInt();
            
            if (k == 0) {
                break;
            }
            
            S = new int[k];
            list = new ArrayList<>();
            
            for (int i = 0; i < k; i++) {
                S[i] = sc.nextInt();
            }
            
            backtrack(0, 0);
            System.out.println();
        }
        
        sc.close();
    }
    
    private static void backtrack(int start, int depth) {
        if (depth == 6) {
            for (int el : list) {
                System.out.print(el + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = start; i < k; i++) {
            list.add(S[i]);
            backtrack(i + 1, depth + 1);
            list.remove(list.size() - 1);
        }
    }
}