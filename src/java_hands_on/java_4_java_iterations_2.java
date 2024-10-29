/*
Problem : Factorial of Input Numbers
 */
package java_hands_on;
import java.math.BigInteger;
import java.util.Scanner;

public class java_4_java_iterations_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = 5;
        int[] numbers = new int[5];
        for(int i=0; i<5; i++){
            numbers[i] = sc.nextInt();
        }

        for(int num:numbers){
            System.out.println(factorial(num));
        }
    }

    private static BigInteger factorial(int num) {
        if(num < 0){
            throw new IllegalArgumentException("Number must be non-negative");
        }
        if(num == 0 || num == 1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(num).multiply(factorial(num - 1));
    }
}
