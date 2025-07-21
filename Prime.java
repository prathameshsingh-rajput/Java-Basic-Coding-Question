/*1. Prime Number Check
        Problem:
        Write a program that takes an integer input n and checks whether it is a prime number or not.
*/

import java.util.Scanner;

public class Prime{
    public boolean isPrime(int n){
        if(n < 2){
            return false;
        }

        boolean isPrimeNum = true;

        for(int i = 2; i <= Math.sqrt(n); ++i){
            if(n % i == 0){
                isPrimeNum = false;
                break;
            }
        }

        return isPrimeNum;
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Prime obj = new Prime();

        System.out.println("Enter a number: ");
        int n = in.nextInt();

        if(obj.isPrime(n)){
            System.out.println(n + " is a prime number.");
        }else{
            System.out.println(n + " is not a prime number.");
        }
    }
}