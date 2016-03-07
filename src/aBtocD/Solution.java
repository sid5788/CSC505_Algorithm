//Sid: minimum operations required to reach from (a,b) to (c,d) through (a+b,b) and (a,a+b) 
package aBtocD;

import java.io.*;
import java.util.*;

public class Solution {
    private int a,b,c,d,count;
    
    Solution(){
    	Scanner scan = new Scanner(System.in);
    	a = scan.nextInt();
    	b = scan.nextInt();
    	c = scan.nextInt();
    	d = scan.nextInt();
    	count = 0;
    	scan.close();
    }
    
    public void operation(int c, int d){
    	while (true){
    	System.out.println(c+" "+d+"count = "+count);
    	if (a == c && b == d){
    		count += 1;
    		break;
    	}else if (c<a||d<b){
    		count = -1;
    		break;
    	} else {
    		if(c>d){
    			count+=1;
    			c =c-d;
    		}else{
    			count+=1;
    			d = d-c;
    			}
    	}
    	}
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
    	boolean yes = false;
    	sol.operation(sol.c,sol.d);
    if(sol.count > 0) {
    	yes = true;
    	System.out.println("count="+sol.count);
    	System.out.println(yes);
    }else{
    	System.out.println("count="+sol.count);
    	System.out.println(yes);
    }
    	
    }
}