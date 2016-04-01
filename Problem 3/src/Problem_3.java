import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Problem_3 {

	public static void main(String[] args) {
		//The prime factors of 13195 are 5, 7, 13 and 29.
		//What is the largest prime factor of the number 600851475143 ?
	
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		long n = reader.nextLong(); // Scans the next token of the input as an int.
		System.out.println(largest_prime(n));
	}
	
	public static long largest_prime(long n)
	{
		long temp = n;
		long largest = 0;
		long value = 1;
		
		while(true)
		{
			if(value == n)
			{
				break;
			}
			for(long i = 2; i < n; i++)
			{
				if(isPrime(i) == true && temp%i == 0)
				{
					temp = temp / i;
					largest = i;
					value = value * i;
					break;
				}
			}
		}
		return largest;
	}
	
	public static boolean isPrime(long number){
		for(long i=2; i<number; i++){
		        if(number%i == 0){
		            return false; //number is divisible so its not prime
		        }
		    }
		    return true; //number is prime now
		}
}
