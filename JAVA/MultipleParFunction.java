
import java.io.*;
import static java.lang.System.in;

class Prime {
	void checkPrime(int... numbers) {
		for (int number : numbers) {
			boolean isPrime = true;
			int tillWhen = (int) Math.floor(Math.sqrt(number));
			
			if(number == 1)
				isPrime = false;
			
			for (int x = 2; x <= tillWhen; x++) {
				if (number % x == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				System.out.print(number+" ");
		}
		System.out.println("");
	}
}

public class MultipleParFunction {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		int n1;
		try {
			n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime object = new Prime();
			object.checkPrime(n1, n2, n3, n4, n5);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

