/*
String Compression: Implement a method to perform basic string compression using the counts of repeated characters. 
For example, the string "aabcccccaaa" would become "a2b1c5a3". If the "compressed" string would not become smaller than the original string, your method should return the original string. 
You can assume the string has only uppercase and lowercase letters (a-z, A-Z).
 */
package stringcompresion;

/**
 *
 * @author Constant Likudie
 */
public class StringCompresion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String res = compress("aabcccccaaa");
        System.out.println(res);
    }

    public static String compress(String compStr) {
        StringBuilder output = new StringBuilder();
        char[] strCharArray = compStr.toCharArray();

        Character preVal = strCharArray[0];

        int count = 1;
        for (int i = 1; i < strCharArray.length; i++) {
            Character currentVal = strCharArray[i];
            if (preVal.equals(currentVal)) {
                count += 1;
            } else {
                output.append("").append(Character.toString(preVal)).append(Integer.toString(count));

                count = 1;
                preVal = strCharArray[i];
            }
        }

        output.append("" + preVal + count);
        return output.toString();
    }

}
