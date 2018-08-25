package thirtyDaysOfCode;

import java.util.*;
//import java.io.*;

public class HashMapSolution {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of phone book contacts :"); 
		int n = sc.nextInt();
		sc.nextLine();

		//Creating phone book and storing contacts

		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name and number with space between them:"); 
			String name = sc.next(); 
			int phone = sc.nextInt();
			sc.nextLine();
			phoneBook.put(name, phone);
		}
		System.out.println(phoneBook.toString()); 

		// Returning value for key entered
		System.out.println("Keep entering query as long as you like :");

		while (sc.hasNext()) {
			String s = sc.nextLine();
			// Looking up phone book for user input
			if (phoneBook.containsKey(s)) {
				System.out.println(s + "=" + phoneBook.get(s));
			}
			else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}
}