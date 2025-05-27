package String.easy;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello 123 World!";
        int cnt=countWords(str);
        System.out.println(cnt);
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;   //A:65 //a:97 //'0'=48

        str = str.toLowerCase();

        String vowel="aeiou";

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (vowel.indexOf(ch) != -1) vowels++;
                else consonants++;
            } else if (ch >= '0' && ch <= '9') digits++;
            else if (ch == ' ') spaces++;
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
    }
    static public int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
