package Arrays;

import java.util.*;

public class nonRepeatEle {
	public int[] repeated(int arr[]){
		int i = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		int temp[] = new int[arr.length];
		for(int ele: arr){
			if(map.containsKey(ele)){
				map.put(ele, map.get(ele)+1);
				set.add(ele);
			}else{
				map.put(ele,1);
			}
		}
		
		for(int ele: arr){
			if(!set.contains(ele)){
			temp[i]=ele;
			i++;
			}
		}
		return temp;
	}
}
