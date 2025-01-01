package Array.easy;

import java.util.Arrays;
public class Displaylongestname {
    public static void main(String[] args) {

        String[] names = {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};

        String longesname =Arrays.stream(names).max((a,b) -> Integer.compare(a.length(),b.length())).
                orElse("");

        System.out.println(longesname);

    }
}
