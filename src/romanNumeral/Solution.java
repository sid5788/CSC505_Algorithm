package romanNumeral;

import java.util.*;

class Solution{
	public void getRoman(int n) {
	    String str = "";
	    int count = 0;
	    String romanVal[] = { "I", "IV", "V", "IX", "X", "XL", "L","XC", "C", "CD", "D", "CM", "M" };
	    int decValue[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,900, 1000 };
	    int len = decValue.length -1;
	    for (int i = len; i >= 0; i--) {
	        count = n / decValue[i];
	        n %= decValue[i];
	        while (count > 0) {
	            str+=(romanVal[i]);
	            count--;
	        }
	    }
	    System.out.println(str);
	}
	
	public static void main(String args[]){
		Solution sol = new Solution();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		sol.getRoman(n);
	}
}