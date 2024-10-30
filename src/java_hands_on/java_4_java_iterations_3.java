/*
Problem : Find Second-Largest Prime Number
 */

package java_hands_on;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class java_4_java_iterations_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> primes = new ArrayList<>();

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            if(isPrime(num)){
                primes.add(num);
            }
        }

        Integer secondLargestPrime = secondLargestPrime(primes);
        if(secondLargestPrime != null){
            System.out.println(secondLargestPrime);
        }else{
            System.out.println("No second largest prime number found");
        }

        sc.close();
    }

    private static Integer secondLargestPrime(ArrayList<Integer> primes) {
        if(primes.size() < 2){ return null; }
        primes.sort(Collections.reverseOrder());
        if (primes.size() == 2) { return primes.get(0); }
        return primes.get(1);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }
        return true;
    }
}
