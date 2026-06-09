public class lsubstring_withoutrep {
    public int lengthOfLongestSubstring(String s) {
        int[] charIndex = new int[128];
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, charIndex[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            charIndex[currentChar] = right + 1;
        }

        return maxLength;
    }
    public static void main(String[] args) {
        lsubstring_withoutrep solution = new lsubstring_withoutrep();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }
    
}
