public class Find_Permutation_using_backtracking_17_3 {
    public static void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + ch);
        }
    }

    public static void main(String args[]) {
        String str = "abc";
        findPermutations(str, "");
    }
}

// T.C. = O(n!)
// S.C. = O(n)
// Enumeration type of problem