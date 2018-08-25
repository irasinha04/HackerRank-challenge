package mathematics;

public class PrimeFunctions_AuxiliaryCode {
	
	public boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public int[] getPrimeNums() {
		int[] primeArray = new int[25];
		int index = 0;
		for (int i = 2; index < primeArray.length; i++) {
			if (isPrime(i)) {
				primeArray[index] = i;
				index++;
			}
		}
		
//		for(int i = 0; i < primeArray.length; i++) {
//			System.out.print(primeArray[i] + ", ");
//		}
		
		return primeArray;
	}
	
}
