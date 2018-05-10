package leetCode;

import java.util.Scanner;

interface AdvancedArithmetic {
	// public is by default here...
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {

	// mandatory to write public access modifier when overriding interface's
	// function
	public int divisor_sum(int n) {
		if (n == 1)
			return 0;
		int total_sum = 1;
		int temp_n = n;

		for (int i = 2; i < temp_n; i++) {
			if (n % i == 0) {
				temp_n = n / i;
				total_sum += temp_n + i;
			}
		}
		return total_sum;
	}
}

public class FactorSum {
	public static void main(String[] args) {
		MyCalculator my_calculator = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(my_calculator.divisor_sum(n) + "\n");
		sc.close();
	}
}