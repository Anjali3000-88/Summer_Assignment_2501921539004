public class Is_Subsequence {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.length() == 0) {
            return true;
        }
        int sIndex = 0;
        int tIndex = 0;
        while (tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
                if (sIndex == s.length()) {
                    return true;
                }
            }
            tIndex++;
        }
        return false;
    }
    public static void main(String[] args) {
        Is_Subsequence solution = new Is_Subsequence();
        String s = "abc";
        String t = "ahbgdc";
        boolean result = solution.isSubsequence(s, t);
        System.out.println("Is Subsequence: " + result);
    }
    
}
