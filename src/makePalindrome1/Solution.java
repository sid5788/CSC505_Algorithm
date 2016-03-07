/*
 * Sid: Minimum number of edits required in the same string to make a string palindrome
 * 
 */

package makePalindrome1;

import java.io.*;
import java.util.*;

public class Solution {
    private Scanner scan = new Scanner(System.in);
    private String s;
    public Solution(){
    	s = scan.nextLine();
    }
    
    public int minEdits(){
    	int x = 0;
    	int len = s.length();
    	char a,b;
    	for(int i =0; i<len/2; i++){
    		System.out.println(s.charAt(i)+" "+s.charAt(len-i-1));
    		a = Character.toLowerCase(s.charAt(i));
    		b = Character.toLowerCase(s.charAt(len-i-1));
    		if(a < b){
    			x+= (b-a);
    		}
    	}
    	return x;
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
        System.out.println(sol.minEdits());	
    }
}