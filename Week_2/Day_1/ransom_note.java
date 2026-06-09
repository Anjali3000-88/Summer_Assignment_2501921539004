public class ransom_note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charCount = new int[26];

        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                return false;
            }
            charCount[c - 'a']--;
        }

        return true;
    }
    public static void main(String[] args) {
        ransom_note solution = new ransom_note();
        String ransomNote = "a";
        String magazine = "b";
        boolean result = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can Construct: " + result);
    }
    
}
