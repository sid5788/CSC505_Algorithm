package Arrays;
import java.util.*;

public class repeatedEle {
	public int[] repeated(int arr[]){
		int i = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		int temp[] = new int[arr.length];
		for(int ele: arr){
			if(map.containsKey(ele)){
				map.put(ele, map.get(ele)+1);
				temp[i]=ele;
				i++;
			}else{
				map.put(ele,1);
			}
		}
		return temp;
	}

}
