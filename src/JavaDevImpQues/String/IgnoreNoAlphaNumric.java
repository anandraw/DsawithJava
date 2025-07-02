package JavaDevImpQues.String;

public class IgnoreNoAlphaNumric {
    public static void main(String[] args) {
        String str="1234d";
        char[] arr=str.toCharArray();
        StringBuilder newstr= new StringBuilder();
        for (char c:arr){
            if (Character.isDigit(c)){
               continue;
            }else{
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
        return;

    }
}
