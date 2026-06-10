public class Repeated_substring_pattern {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i != 0)
                continue;
            String pattern = s.substring(0, i);
            String temp = "";
            int times = n / i;
            for (int j = 0; j < times; j++) {
                temp += pattern;
            }if (temp.equals(s)) {
                return true;
            }
        }
            return false;
            }
        
 public static void main(String[] args) {
        Repeated_substring_pattern solution = new Repeated_substring_pattern();
        String s = "abcabc";
        boolean result = solution.repeatedSubstringPattern(s);
        System.out.println("Repeated Substring Pattern: " + result);
    }
    
}
