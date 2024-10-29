/*
Problem : Smallest Character in String
*/

package java_hands_on;
import java.util.Scanner;

public class java_4_java_iterations_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char minChar = findSmallestCharacter(input);
        System.out.println(minChar);

        sc.close();
    }

    private static char findSmallestCharacter(String str) {
        if(str == null || str.isEmpty()){
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        char minChar = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if(currentChar < minChar){
                minChar = currentChar;
            }
        }
        return minChar;
    }
}
