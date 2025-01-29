import java.util.*;
class Main {
    static int L, C;
    static char[] chars;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        L = sc.nextInt();
        C = sc.nextInt();
        chars = new char[C];
        for (int i = 0; i < C; i++) {
            chars[i] = sc.next().charAt(0);
        }
        Arrays.sort(chars);
        
        backtrack(0, "", 0, 0);
        sc.close();
    }
    
    private static void backtrack(
        int index, String current, int vowels, int consonants
    ) {
        if (current.length() == L) {
            if (vowels >= 1 && consonants >= 2) {
                System.out.println(current);
            }
            return;
        }
        
        for (int i = index; i < C; i++) {
            char ch = chars[i];
            if (isVowels(ch)) {
                backtrack(i + 1, current + ch, vowels + 1, consonants);
            } else {
                backtrack(i + 1, current + ch, vowels, consonants + 1);
            }
        }
    }
    
    private static boolean isVowels(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}