package thirtyDaysOfCode;

//import java.io.*;
import java.util.*;

public class Solution {

    // Separate the word into even and odd placed alphabets
    public char[] getStringArray(String myString) {
        // Convert string to a character array
        char[] String2charArray = myString.toCharArray();
        return String2charArray;
    }
    
    public String getEvenString(char[] charArray) {
        // Get even placed alphabets
    	int length;
    	if(charArray.length % 2 == 0) {
    		length = ( charArray.length / 2 );
    	}else {
    		length = ( charArray.length / 2 ) + 1;
    	}
    	int j = 0;
        char[] even = new char[length];
        for(int i = 0; i < charArray.length; i++) {
            if(i % 2 == 0){
                even[j] = charArray[i];
                j++;
            }
        }
        String evenString = new String(even);
        return evenString;
    }
    
    public String getOddString(char[] charArray) {
        // Get odd placed alphabets
        int length = ( charArray.length / 2 );
        int j = 0;
        char[] odd = new char[length];
        for(int i = 0; i < charArray.length; i++) {
            if(i % 2 != 0){
                odd[j] = charArray[i];
                j++;
            }
        }
        String oddString = new String(odd);
        return oddString;
    }
    
    public static void main(String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        System.out.println("Enter numer of test cases :"); //
        int T = sc.nextInt();
        sc.nextLine();
        if(T >= 1 && T <= 10) {
        	for(int i = 0; i < T; i++) {
        		System.out.println("Enter String :"); //
        		String str = sc.nextLine();
        		if(str.length() >= 2 && str.length() <= 10000) {
        			Solution evenOdd = new Solution();
        			char[] charArr = evenOdd.getStringArray(str);
        			String even = evenOdd.getEvenString(charArr);
        			String odd = evenOdd.getOddString(charArr);
        			System.out.println(even + " " + odd);
        		}
        	}
        }
        sc.close();
    }
}