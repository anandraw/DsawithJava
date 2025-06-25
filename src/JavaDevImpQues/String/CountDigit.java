package JavaDevImpQues.String;

public class CountDigit {
    public static void main(String[] args) {
        String str="an2436djdh567";

        StringBuilder sb = new StringBuilder();

       for (char ch:str.toCharArray()){
           if (Character.isDigit(ch)){
               sb.append(ch);
           }
       }
        System.out.println(sb.length());
    }
}
