public class permutation_in_str {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            charCount[s2.charAt(i) - 'a']--;

            if (i >= s1.length()) {
                charCount[s2.charAt(i - s1.length()) - 'a']++;
            }

            if (areAllZero(charCount)) {
                return true;
            }
        }

        return false;
    }

    private boolean areAllZero(int[] charCount) {
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        permutation_in_str solution = new permutation_in_str();
        String s1 = "ab";
        String s2 = "eidbannn";
        boolean result = solution.checkInclusion(s1, s2);
        System.out.println("Check Inclusion: " + result);
    }

    
}
