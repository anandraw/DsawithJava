package GggeksForGeeks;

//add two binary string
public class Day15 {
    public static void main(String[] args) {
        String s1 = "01101";
        String s2 = "00111";

        System.out.println(addBinary(s1, s2));
    }
    public static String addBinary(String s1, String s2) {

        s1 = trimLeadingZeros(s1);
        s2 = trimLeadingZeros(s2);
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int bit1 = (i >= 0) ? s1.charAt(i--) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j--) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
    static String trimLeadingZeros(String s){

        int firstOne = s.indexOf('1');

        if(firstOne == -1){
            return "0";
        }else{
            return s.substring(firstOne);
        }
    }
}
