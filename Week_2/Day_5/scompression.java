public class scompression {
    public int compress(char[] chars) {
        int n = chars.length;
        int write = 0;
        int i =0;
        while(i<n){
            char currentChar = chars[i];
            int count = 0;
            while(i<n && chars[i]==currentChar){
                i++;
                count++;
            }
            chars[write++] = currentChar;
            if(count>1){
                String countStr = Integer.toString(count);
                for(char c:countStr.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;

    
}
