//Sid: To Print all Subsequences of a string 2^n -1.. doesn't include no string(which is in the case of a subset).. for which loop in main should start from i = 0

package subsequenceS;

import java.util.*;
import java.io.*;

class Solution{
	static String s;
	public static void subS(String prefix, String suffix, int n){
		if(n == 0){
			System.out.println(prefix);
			return;
		}
		if(suffix.length() == 0) {
			return;
		}
		subS(prefix+suffix.charAt(0), suffix.substring(1), n-1);
		subS(prefix, suffix.substring(1), n);
	}
public static void main(String []args){
	Scanner scan = new Scanner(System.in);
	s = scan.nextLine();
	for (int i = 1; i<=s.length(); i++){
		subS("",s,i);
	}
}
}