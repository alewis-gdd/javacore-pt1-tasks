import java.util.*;

public class ReverseString {

    public static String firstImplementation(String word){
        int wordLength;

        wordLength = word.length();

        StringBuilder reversed = new StringBuilder();

        for (int i = wordLength - 1; i >= 0; i--){
            reversed.append(word.charAt(i));
        }

        return reversed.toString();
    }

    public static String secondImplementation(String word){
        StringBuffer reversed = new StringBuffer(word);
        return reversed.reverse().toString();
    }

    public static String thirdImplementation(String word){
        if (word.isEmpty()){
            return word;
        }
        return thirdImplementation(word.substring(1)) + word.charAt(0);
    }

    public static void main(String[] args) {
        String first, second, third;
        first = firstImplementation(args[0]);
        second = secondImplementation(args[0]);
        third = thirdImplementation(args[0]);

        System.out.println("###RESULTS###");
        System.out.println("1st Implementation (for loop): " + first);
        System.out.println("2nd Implementation (string buffer reverse function): " + second);
        System.out.println("3rd Implementation (recursion): " + third);
    }
}
