package Arrays;
import java.util.*;

public class slidingWindowMax {
	public static ArrayList<Integer> slidingWindowMax( int[] arr,  int w) {
		Deque<Integer> q = new LinkedList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int i;
		for (i = 0; i < w; i++){
			while((!q.isEmpty()) && arr[i] >= arr[q.peekLast()]){
				q.removeLast();
			}
			q.addLast(i);
		}
		
		int n =arr.length;
		while(i<n){
			list.add(arr[q.peekFirst()]);
			
			while(!q.isEmpty() && q.peekFirst()<= i-w){
				q.removeFirst();
			}
			
			while(!q.isEmpty() && arr[i] >= arr[q.peekLast()]){
				q.removeLast();
			}
			q.addFirst(i);
		}
		
		list.add(arr[q.peekFirst()]);
		return list;
	}
}
