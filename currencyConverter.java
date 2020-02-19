package currencyConverter;
import java.util.Scanner;

public class currencyConverter {
/// Currency Converter 
	/// get an input and respond with correct answer
	/// for each loop for each currency type
	/// output amount of money in desired currency
	/// everything is based in dollars at the beginning to be able to convert the currency
	/// EX. What currency would you like to convert to?
	/// EX. Euro
	/// EX. What amount?
	/// EX. 20 
	/// EX 22.2
	public static void main(String[] args)
	{
		double amount, dollar, euros, yen, pound, reais, pesos;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Hello, Welcome to the Currency Converter");
		
		System.out.println();

		System.out.println("What currency would you like to convert to");
		
		System.out.println();
		
		System.out.println("1:Dollar \t2:Euros \t3:Yen \n4:Pound \t5:Reais  \t6:Pesos \n(Choose number of whichever one you want to choose) ");

		int choice = in.nextInt();
		
		System.out.println("How much money would you like to convert? (In US Dollars)");
		
		amount = in.nextInt();
		
		//conversion
		if (choice == 1)
		{
			dollar = amount;
			System.out.println("USD to USD = "+dollar);
			
		}
		else if (choice == 2)
		{
			 euros = amount * .93;
			 System.out.println("USD to Euros = "+euros);
		}
		else if (choice == 3)
		{
			yen = amount * 111.41;
			System.out.println("USD to Yen = "+yen);

		}
		else if (choice == 4)
		{
			pound = amount * .77;
			System.out.println("USD to Pounds = "+pound);

		}
		else if (choice == 5)
		{
			reais = amount * 4.37;
			System.out.println("USD to Reais = "+reais);

		}
		else if (choice == 6)
		{
			pesos = amount * 18.57;
			System.out.println("USD to Pesos = "+pesos);

		}
		else 
		{
			System.out.println("Wrong choice, Try Again!");

		}
	} 
	

}
