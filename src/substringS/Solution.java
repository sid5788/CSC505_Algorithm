//Sid: To Print all Substrings(i.e. contiguous of a string ((n*(n+1)) /2)

package substringS;

import java.util.*;
import java.io.*;

class Solution{
	static String s;
	static String pal[];
	public static int check(String s){
		int len = s.length();
    	for(int i =0; i<len/2; i++){
    		if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(len-i-1))){
    		    return 0;
    		}
    	}
    	System.out.println(s);
    	return 1;
	}
	public static void subS(){
		String temp;
		int count = 0;
		int len = s.length();
		for(int i = 0; i< len; i++){
			for(int j = i+1; j<= len;j++){
			temp = s.substring(i, j);
			count+=check(temp);
			}
		}
		System.out.println(count);
	}
public static void main(String []args){
	Scanner scan = new Scanner(System.in);
	s = scan.nextLine();
	subS();
}
}