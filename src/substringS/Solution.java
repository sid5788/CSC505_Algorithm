//Sid: To Print all Substrings(i.e. contiguous of a string ((n*(n+1)) /2)

package substringS;

/*Better solution:
 static int palindrome(String str) {
        String temp;
        char[] s = str.toCharArray();
        int len = s.length;
        int left = 0, right = 0;
        HashMap <String, Integer> map = new HashMap<String,Integer>();
        for (int i = 0; i<len; i++){
            left =i;
            right = i;
            while(left>=0 && right<len){
                if (s[left]!=s[right]){
                    break;
                }
                temp = str.substring(left,right+1);
                map.put(temp,1);
                left--;
                right++;
            }
        }
        
        for (int i = 0; i<len-1; i++){
            left =i;
            right = i+1;
            while(left>=0 && right<len){
                if (s[left]!=s[right]){
                    break;
                }
                temp = str.substring(left,right+1);
                map.put(temp,1);
                left--;
                right++;
            }
        }
       
        return map.size();
    }
 */
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