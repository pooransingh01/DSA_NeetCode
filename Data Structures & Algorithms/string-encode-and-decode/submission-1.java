class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_string = new StringBuilder();

        for (String s : strs) {
            encoded_string.append(s.length());
            encoded_string.append('#');
            encoded_string.append(s);
        }

        return encoded_string.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded_string = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int length = 0;

            while (str.charAt(i) != '#') {
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }

            i++;

            decoded_string.add(str.substring(i, i + length));
            i = i + length;
        }

        return decoded_string;
    }
}


    

// Take a string builder and find the length of it and add # special character. We are doing this in order to write our encoder function in encode and decode strings
// Do sb.append the length; and then print the #


