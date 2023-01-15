public class Main {
    public static void main(String[] args) {
        String[] strs = {"abc", "ab", "abdc"};
        System.out.println(Solution.longestCommonPrefix(strs));
    }

    public static class Solution {
        public static String longestCommonPrefix(String[] strs) {
            // Runtime = 1 ms; Memory = 40.2 MB
            StringBuilder str = new StringBuilder();
            char s = ' ';
            if (strs.length > 1) {
                for (int t = 0; t < strs[0].length(); t++) {
                    for (int i = 1; i < strs.length; i++) {
                        if (strs[i].length() > t && strs[0].charAt(t) == strs[i].charAt(t)) {
                            s = strs[0].charAt(t);
                        } else {
                            return str.toString();
                        }
                    }
                    str.append(s);
                }
            } else {
                return strs[0];
            }
            return str.toString();
        }
    }
}
