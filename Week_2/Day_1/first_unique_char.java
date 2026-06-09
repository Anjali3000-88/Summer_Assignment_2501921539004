public class first_unique_char {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        first_unique_char solution = new first_unique_char();
        String s = "weekend";
        int result = solution.firstUniqChar(s);
        System.out.println("First Unique Character Index: " + result);
    }
    
}
