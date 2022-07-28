package com.bridgelab.algorithmprograms;
import java.util.*;
public class PrimeNumbers {

	public PrimeNumbers(int num)
	{
		int i; 
		int j;

		List<Integer> list = new ArrayList<>();
		List<String> primeList = new ArrayList<>(), anagramList = new ArrayList<>();

		for (i = 2; i < num; i++)		
		{        
			for (j = 2; j < i; j++)	//check for nontrivial divisors
			{      
				if (i % j == 0) 	//nontrivial divisor found -> not a prime
					break;          
			}
			if (j == i)            //this means the cycle above run till end
			{					 //hence no nontrivial divisors, hence a prime
				System.out.println(i);

				primeList.add(Integer.toString(i));
			}
		}
		System.out.println();
		System.out.println("Prime Numbers List: "+primeList);
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Range: ");
		int num =scanner.nextInt();
		PrimeNumbers prime = new PrimeNumbers(num);
	}
}
