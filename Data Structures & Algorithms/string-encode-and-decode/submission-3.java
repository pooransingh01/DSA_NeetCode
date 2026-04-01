class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();

        for (String str : strs) {
            encoded_string.append(str.length()).append('#').append(str);
        }

        return encoded_string.toString();
    }

    public List<String> decode(String s) {
        List<String> decoded_string = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1;
            
            decoded_string.add(s.substring(i, i + length));
            i += length;
        }

        return decoded_string;
    }
}


    

// Take a string builder and find the length of it and add # special character. We are doing this in order to write our encoder function in encode and decode strings
// Do sb.append the length; and then print the 
// Do it through substring method which will give us the original string  


