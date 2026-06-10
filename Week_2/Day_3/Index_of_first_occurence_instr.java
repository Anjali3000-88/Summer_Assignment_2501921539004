public class Index_of_first_occurence_instr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            throw new IllegalArgumentException("Input strings cannot be null.");
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength == 0) {
            return 0; // An empty needle is found at index 0
        }

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i; // Found the first occurrence of the needle
            }
        }

        return -1; // Needle not found in haystack
    }
    public static void main(String[] args) {
        Index_of_first_occurence_instr solution = new Index_of_first_occurence_instr();
        String haystack = "rebell";
        String needle = "ll";
        int result = solution.strStr(haystack, needle);
        System.out.println("Index of First Occurrence: " + result);
    }
    
}
