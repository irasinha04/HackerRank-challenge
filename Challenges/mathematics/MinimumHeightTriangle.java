package mathematics;

import java.util.*;

public class MinimumHeightTriangle {
	 
	static int lowestTriangle(int base, int area) {
	        int height = ( 2 * area ) / base;
	        float auxArea = (float) area;
	        float auxBase = (float) base;
	        float auxHeight =  2 * (auxArea) / auxBase;
	        
	        while(auxHeight - height != 0) {
	        	height ++;
	            auxArea = (auxBase * height) / 2;
	            auxHeight = (2 * auxArea) / auxBase; 
	        }
	        return height;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int base = sc.nextInt();
	        int area = sc.nextInt();
	        int height = lowestTriangle(base, area);
	        System.out.println(height);
	        sc.close();
	    }
}
