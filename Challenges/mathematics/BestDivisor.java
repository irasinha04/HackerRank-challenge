package mathematics;

import java.util.*;

public class BestDivisor {

    public static Object[] getDivisor(int num) {
    	LinkedList<Integer> llist = new LinkedList<Integer>();
     
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                llist.add(i);
            }
        }
        Object[] divisorArray = llist.toArray();
        return divisorArray;
    }

    public static int sumOfDig(int x) {
        int sum = 0;
        while(x > 0) {
            sum = sum + x % 10;
            x = x / 10;
        }
        return sum;
    }
    
    public static int getMin(int a, int b) {
        if(a < b) {
            return a;
        }
        return b;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        Object[] divisor = getDivisor(n);
              
        int betterNum = (int)(divisor[0]);
        int overallBetterNum = betterNum;
        int sum = sumOfDig((int)divisor[0]);
        int overallSum = sum;
        for(int i = 0; i < divisor.length - 1; i++) {
            for(int j = i+1; j < divisor.length; j++) {
                if((sumOfDig((int)divisor[i]) > sumOfDig((int)divisor[j]))){
                	betterNum = (int)divisor[i];
                	sum = sumOfDig((int)divisor[i]);
                	System.out.println("i = " + (int)divisor[i] + " sum = " + sumOfDig((int)divisor[i]));
                    System.out.println("j = " + (int)divisor[j] + " sum = " + sumOfDig((int)divisor[j]));
                	System.out.println("Better num = " + betterNum);
                } else if(sumOfDig((int)divisor[i]) < sumOfDig((int)divisor[j])) {
                    betterNum = (int)divisor[j];
                    sum = sumOfDig((int)divisor[j]);
                    System.out.println("i = " + (int)divisor[i] + " sum = " + sumOfDig((int)divisor[i]));
                    System.out.println("j = " + (int)divisor[j] + " sum = " + sumOfDig((int)divisor[j]));
                	System.out.println("Better num = " + betterNum);
                } else if(sumOfDig((int)divisor[i]) == sumOfDig((int)divisor[j])){
                    betterNum = getMin((int)divisor[i],(int)divisor[j]);
                    sum = sumOfDig((int)divisor[i]);
                    System.out.println("i = " + (int)divisor[i] + " sum = " + sumOfDig((int)divisor[i]));
                    System.out.println("j = " + (int)divisor[j] + " sum = " + sumOfDig((int)divisor[j]));
                	System.out.println("Better num = " + betterNum);
                }
                if(sum > overallSum) {
                	overallBetterNum = betterNum;
                	overallSum = sum;
                	System.out.println("*****Overall = "  +overallBetterNum);
                }
            }
            
        }
        System.out.println(overallBetterNum);
        scanner.close();
    }
}
