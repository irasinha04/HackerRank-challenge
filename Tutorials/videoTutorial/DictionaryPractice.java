package videoTutorial;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		
		// English to Spanish Dictionary
		
		Map<String,String> engSpanDictionary = new HashMap<String,String>();
		
		//Putting things inside our dictionary
		
		engSpanDictionary.put("Monday", "Lunes");
		engSpanDictionary.put("Tuesday", "Martes");
		engSpanDictionary.put("Wednesday", "Miercoles ");
		engSpanDictionary.put("Thursday", "Jueves");
		engSpanDictionary.put("Friday", "Viernes");
		engSpanDictionary.put("Saturday", "Sabado");
		engSpanDictionary.put("Sunday", "Domingo");
		
		//Retrieve things from dictionary
		
		System.out.println(engSpanDictionary.get("Monday"));
		System.out.println(engSpanDictionary.get("Tuesday"));
		System.out.println(engSpanDictionary.get("Wednesday"));
		System.out.println(engSpanDictionary.get("Thursday"));
		System.out.println(engSpanDictionary.get("Friday"));
		
		//Print out all keys
		System.out.println(engSpanDictionary.keySet());
		//Print out all values
		System.out.println(engSpanDictionary.values());
		//Print out the size
		System.out.println("The size of our dictionary is: "+engSpanDictionary.size());
		
		System.out.println();
		System.out.println();
		
		//Shopping List
		
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
		shoppingList.put("Cheese", true);
		shoppingList.put("Bread", Boolean.TRUE);
		shoppingList.put("Oranges", Boolean.TRUE);
		shoppingList.put("Eggs", Boolean.FALSE);
		shoppingList.put("Sugar", false);
		
		//Retrieve items
		
		System.out.println("Checking if responds with TRUE and FALSE");
		if(shoppingList.get("Bread") == true) {
			System.out.println("** Responds **");
		}
		
		System.out.println(shoppingList.get("Bread"));
		System.out.println(shoppingList.get("Sugar"));
		
		//Key-Value Pairs Print Out
		System.out.println(shoppingList.toString());
		// Is Empty ?
		System.out.println(shoppingList.isEmpty());
		//Remove some objects
		shoppingList.remove("Eggs");
		System.out.println(shoppingList.toString());
		//Replace values for a certain key
		shoppingList.replace("Sugar", Boolean.TRUE);
		System.out.println(shoppingList.toString());
		
		//Clear dictionary
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		// Is Empty ?
		System.out.println(shoppingList.isEmpty());
		
	}

}
