public class StringReverse {

    public String reverseString(String inputString) {
        String rev ="";
        for (int i = inputString.length()-1; i>=0; i--){
            rev = rev + inputString.charAt(i);
        }
        System.out.println("Reversed string is :: "+rev);
        return rev;
    }

    public String reverseStringUsingStringBuffer(String inputString){
        StringBuffer sb = new StringBuffer(inputString);
        return sb.reverse().toString();
    }
}
