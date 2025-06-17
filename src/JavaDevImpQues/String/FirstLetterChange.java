package JavaDevImpQues.String;

// given string make first letter of every word shouble be upparcase
public class FirstLetterChange {
    public static void main(String[] args) {

        String str = "i love india"; // output:"I Love India"
        String result =" ";
        String[] arr = str.split(" ");
        for (String word:arr){
            char capital=Character.toUpperCase(word.charAt(0));
            word=word.replaceFirst(word.charAt(0)+"",capital+"");
            result=result+word+" ";
        }
        System.out.println(result);
    }
}
