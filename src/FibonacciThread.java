//Justin Himmighoefer
//Write a program to output Fibonacci sequence of user input

import java.io.*;
import java.util.*;

public class FibonacciThread
{
	public static long fib(int n)
	{ 
		if (n <= 1) return n; 
		else return fib(n-1) + fib(n-2); 
	}

	public static void main(String[] args)
	{ 
		int N;
		System.out.println("Please enter the amount of Fibonacci entries you would like to be displayed.");
		Scanner console = new Scanner(System.in);
		N = console.nextInt(); 
		for (int i = 1; i <= N; i++) 
		System.out.println(i + "\t|\t" + fib(i-1)); 
	} 
}